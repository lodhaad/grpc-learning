package com.lodhaad.payment.server;

import com.lodhaad.di.server.AppConfig;
import com.lodhaad.payment.execution.service.PaymentService;
import com.proto.payments.*;
import io.grpc.stub.StreamObserver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;

public class BasePaymentServiceImpl extends PaymentServiceGrpc.PaymentServiceImplBase {


   // @Autowired
    private  PaymentService service;


    static {

        System.out.println("Loading system properties " );

        File file = new File(".");
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader reader = null ;

        try {
            reader = new BufferedReader(new FileReader("src/main/java/properties/Application.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        System.out.println("Loading system properties ");

        try {
            System.getProperties().load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

    @Override
    public void processClientCreditPayment(CreditPaymentRequest request, StreamObserver<CreditPaymentResponse> responseObserver) {


        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        service = appContext.getBean("PaymentService", PaymentService.class);


        service.processCreditPayment(request);

        CreditPaymentResponse response = CreditPaymentResponse.newBuilder().setSrcRef(request.getSrcRef()+"IR").build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void processClientDebitPayment(DebitPaymentRequest request, StreamObserver<DebitPaymentResponse> responseObserver) {
        System.out.println("Not doing anything in here right now ");
    }
}



