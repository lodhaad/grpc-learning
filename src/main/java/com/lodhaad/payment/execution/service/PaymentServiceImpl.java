package com.lodhaad.payment.execution.service;

import com.google.protobuf.ProtocolStringList;
import com.lodhaad.payment.execution.datamodel.*;
import com.lodhaad.payment.execution.publisher.PublisherPayment;
import com.lodhaad.payment.execution.publisher.StatePublisher;
import com.lodhaad.payment.execution.repo.CreditPaymentRepo;
import com.proto.payments.CreditPaymentRequest;
import com.proto.payments.enrichment.BaseEnrichServiceGrpc;
import com.proto.payments.enrichment.EnrichedBasePayment;
import com.proto.payments.enrichment.EnrichedBasePaymentRequest;
import com.proto.payments.enrichment.EnrichedBasePaymentResponse;
import com.proto.payments.fraud.FraudCheckData;
import com.proto.payments.fraud.FraudCheckRequest;
import com.proto.payments.fraud.FraudCheckResponse;
import com.proto.payments.fraud.FraudCheckServiceGrpc;
import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransfer;
import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest;
import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse;
import com.proto.payments.fundavailablity.FundAvailablityServiceGrpc;
import com.proto.payments.validation.ValidationRequest;
import com.proto.payments.validation.ValidationResponse;
import com.proto.payments.validation.ValidationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service("PaymentService")
public class PaymentServiceImpl implements  PaymentService {

    @Autowired
    CreditPaymentRepo repo;

    @Autowired
    StatePublisher publisher;



    ExecutorService executirService  = Executors.newSingleThreadExecutor();


    @Autowired
    PublisherPayment paymentPub;

    /// add a Kafka producer that will send data to Kafka

    static {
        System.out.println("calling this block");


    }

    @Override
    public void processCreditPayment(CreditPaymentRequest request) {

        publisher.config();







        ////generate the internal source ref id same as external and add IR

        System.out.println("in process payments");

        PaymentProcessingStatus validationStatus = new PaymentProcessingStatus();



        validateCreditPayment(request, validationStatus);

        validationStatus.setPaymentRefId(request.getSrcRef());

        Callable<String> statusThread = () -> {
            publisher.publish(validationStatus);
            return "Validation Status published";

        };
        Future<String> futureService = executirService.submit(statusThread);

        try {
            String value = futureService.get();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        if (validationStatus.getPaymentProcessingStatus() == Boolean.FALSE){

            System.out.println("Validation Failed");
            System.out.println(validationStatus.getMessage());
            ///reject the payment with an error code back to the server so that it can be sent to the client
            return;
        }
        else {
            System.out.println("Validation Sucess");
            System.out.println(validationStatus.getMessage());
        }



        ////send the request into a kafka topic for replay

        ///send the same request to validate

        ////extract the message
        CreditTransferPayment payment = extractPaymentInput(request);
        System.out.println(payment);
        ///putting a kafka topic so that this can be pushed into the topic and a consumer can white to a DB
        repo.save(payment);

        Callable<String> callable = () -> {

            paymentPub.publishPaymentAfterEnrichment(payment);
            System.out.println(Thread.currentThread().getName());
            return "Payment Published";

        };

        Future<String> future = executirService.submit(callable);


        try {
            String returnedVal = future.get();
            System.out.println(returnedVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        ////send it for enrichment









        System.out.println("getting from Repo ");


        PaymentProcessingStatus paymentProcessingStatus = new PaymentProcessingStatus();

        EnrichedBasePayment enrcichPaymentDetails = enrichCreditPayment(request, paymentProcessingStatus);

        enrichPaymentAfterGettingEnrichmentData(payment,enrcichPaymentDetails);

        Callable<String> paymentPublishing = () -> {


            paymentPub.publishPaymentAfterEnrichment(payment);
            return "Enriched Payment Pubished";

        };

        Future<String> futurePaymentPub = executirService.submit(paymentPublishing);


        Callable<String> paymentStatusPub = () -> {

            publisher.publish(paymentProcessingStatus);
            return "Enrichment Status Published";

        };

        Future<String> statusPub  = executirService.submit(paymentStatusPub);



        System.out.println(payment);

        //// do sanctions



        /// do fraud check

        System.out.println("doing fraud");
        PaymentProcessingStatus fraudStatus = new PaymentProcessingStatus();
        doFraud(payment,fraudStatus );

        System.out.println(fraudStatus.getMessage());



        Callable<String> fraudPaymentStatus = () -> {

            publisher.publish(fraudStatus);
            return "Fraud Status";

        };

        Future<String> fraudPub  = executirService.submit(fraudPaymentStatus);


        /// do credit check

        System.out.println("doing credit balance check");

        PaymentProcessingStatus checkStatus = new PaymentProcessingStatus();
        fundControl(payment, checkStatus);


        Callable<String> balanceStatus = () -> {

            publisher.publish(checkStatus);
            return "Balance Status";

        };

        Future<String> balanceFut  = executirService.submit(balanceStatus);

        executirService.shutdown();

        /// send to settlements





    }



    private void validateCreditPayment(CreditPaymentRequest paymentRequest, final PaymentProcessingStatus status) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getProperty("validation-service-host"),
                Integer.parseInt(System.getProperty("validation-service-port")))
                .usePlaintext()
                .build();

        ValidationServiceGrpc.ValidationServiceBlockingStub validationServiceBlockingStub =
                ValidationServiceGrpc.newBlockingStub(channel);

        ValidationRequest request = ValidationRequest.newBuilder().setPayment(paymentRequest).build();

        ValidationResponse response;

            try {

                 response = validationServiceBlockingStub.validateBasePayment(request);

                status.setProcessingStep("VALIDATION");
                status.setPaymentProcessingStatus(response.getVaidationState().getValidationStatus());

                ProtocolStringList list = response.getVaidationState().getValidationMessageList();

                StringBuffer buffer = new StringBuffer();
                list.forEach(message -> buffer.append(message.toString()) );


                status.setMessage(buffer.toString());




            }catch (RuntimeException ex) {

                ex.printStackTrace();

                status.setProcessingStep("VALIDATION");
                status.setPaymentProcessingStatus(Boolean.FALSE);
                status.setMessage(ex.getMessage());


            }

            channel.shutdown();


    }

    private  void enrichPaymentAfterGettingEnrichmentData (final CreditTransferPayment payment ,
                                                           final EnrichedBasePayment enrcichPaymentDetails ) {

        payment.getBeneBankDetails().setBIC(enrcichPaymentDetails.getBeneBankBIC());
        payment.getBeneBankDetails().setBranchAddress(enrcichPaymentDetails.getBeneBankAdress());
        payment.getPaymentDetails().setPaymentType(enrcichPaymentDetails.getPaymentType());

    }



    private EnrichedBasePayment enrichCreditPayment(CreditPaymentRequest request,
                                                    final PaymentProcessingStatus paymentProcessingStatus) {


        ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getProperty("enrichment-service-host"),
                Integer.parseInt(System.getProperty("enrichment-service-port")))
                .usePlaintext()
                .build();


        System.out.println("getting into enrichment ");

        BaseEnrichServiceGrpc.BaseEnrichServiceBlockingStub baseEnrichServiceBlockingStub =
                BaseEnrichServiceGrpc.newBlockingStub(channel);

        EnrichedBasePaymentRequest enchichRequest = EnrichedBasePaymentRequest.newBuilder().setRequest(request).build();

        EnrichedBasePaymentResponse response = baseEnrichServiceBlockingStub.enrichBaseCreditPayment(enchichRequest);

         EnrichedBasePayment enrichedData  = response.getEnrichedData();

         String message = response.getMessage();
         Boolean enrichmentStatusFromService = response.getEnrichmentStatus();

         paymentProcessingStatus.setPaymentProcessingStatus(enrichmentStatusFromService);
         paymentProcessingStatus.setMessage(message);
         paymentProcessingStatus.setProcessingStep("ENRICHMENT");
         paymentProcessingStatus.setPaymentRefId(request.getSrcRef());


        channel.shutdown();


        return enrichedData;



    }


    private CreditTransferPayment extractPaymentInput ( CreditPaymentRequest request ) {

        CreditTransferPayment payment = new CreditTransferPayment();

        BeneDetails beneDetails = new BeneDetails();
        beneDetails.setBeneAccount(request.getBeneAccount()).setBeneName(request.getBeneName());

        BeneBankDetails beneBankDetails = new BeneBankDetails();
        beneBankDetails.setBeneBankName(request.getBeneBank());

        PaymentDetail paymentDetail = new PaymentDetail();
        paymentDetail.setAmount(request.getAmount()).setSentCurrency(PaymentCurrency.valueOf(request.getCurrency())).
                setReciptCurrency(PaymentCurrency.valueOf(request.getCurrency()));

        ClientInformation clientInformation = new ClientInformation();
        clientInformation.setClientName(request.getClientName());

        payment.setBeneDetails(beneDetails).setPaymentDetails(paymentDetail).
                setClientInfo(clientInformation).
                setBeneBankDetails(beneBankDetails);

        payment.setSourceRef(request.getSrcRef());

        return payment;


    }


    private void doFraud(CreditTransferPayment payment, final PaymentProcessingStatus status) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getProperty("fraud-service-host"),
                Integer.parseInt(System.getProperty("fraud-service-port")))
                .usePlaintext()
                .build();

        FraudCheckServiceGrpc.FraudCheckServiceBlockingStub fraudService =
                FraudCheckServiceGrpc.newBlockingStub(channel);

        FraudCheckData fraudCheckData = FraudCheckData.newBuilder()
                .setCurrency(payment.getPaymentDetails().getReciptCurrency().name())
                .setClientName(payment.getClientInfo().getClientName())
                .setBeneName(payment.getBeneDetails().getBeneName())

                .build();

        FraudCheckRequest request = FraudCheckRequest.newBuilder().setFraudData(fraudCheckData).build();

        FraudCheckResponse response = fraudService.fraudCheck(request);

        status.setPaymentProcessingStatus(response.getFraudCheckStatus());
        status.setMessage(response.getMessage());
        status.setProcessingStep("FRAUD");
        status.setPaymentRefId(payment.getSourceRef());

        channel.shutdown();




    }

    private void fundControl(CreditTransferPayment payment, final PaymentProcessingStatus status) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getProperty("fundavailablity-service-host"),
                Integer.parseInt(System.getProperty("fundavailablity-service-port")))
                .usePlaintext()
                .build();

        FundAvailablityServiceGrpc.FundAvailablityServiceBlockingStub faService =
                FundAvailablityServiceGrpc.newBlockingStub(channel);

        FundAvailablityOnCreditTransfer fac = FundAvailablityOnCreditTransfer.newBuilder().build();

        FundAvailablityOnCreditTransferRequest request = FundAvailablityOnCreditTransferRequest.newBuilder()
                .setFundAvaialblity(fac).build();

        FundAvailablityOnCreditTransferResponse response =  faService.checkFundAvailablity(request);

        status.setProcessingStep("FUND CONTROL");
        status.setPaymentProcessingStatus(response.getAvailablityStatus());
        status.setPaymentRefId(payment.getSourceRef());
        status.setMessage("");



        channel.shutdown();




    }

}
