package com.lodhaad.payment.client;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;
import com.lodhaad.payment.execution.datamodel.CreditTransferPaymentStatus;
import com.proto.payments.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RSortedSet;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class PaymentClient {




    public void run () {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();


        processPayment(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();



    }

    private void processPayment(ManagedChannel channel) {

        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);

        CreditPaymentRequest request;

        for (int i =0 ; i < 1 ; i ++ ) {

             request = CreditPaymentRequest.newBuilder().
                    setAmount(0.0)
                    .setBeneAccount("123456789")
                     .setBeneBank("HSBC")
                    .setBeneName("Aditya Lodha")
                    .setClientAccount("211177")
                    .setClientName("Ananya Lodha")
                    .setCurrency("SGD")
                    .setSrcRef("1234abcd"+i)
                    .build();


            CreditPaymentResponse response = stub.processClientCreditPayment(request);

            System.out.println(
                    response.getSrcRef() + "  "

            );

            response.getStatusesList().forEach(System.out::println);





        }








    }

    public void getDataFromCache () {

        RedissonClient client = null ;


        RMap<String, CreditTransferPayment> map ;

        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://127.0.0.1:6379");

        client = Redisson.create(config);

        map = client.getMap("credit_payments");

        String clientRef = "1234abcd1";

        System.out.println("From cache");

        System.out.println(map.get(clientRef));

        RMap<String, RSortedSet<CreditTransferPaymentStatus>> status = client.getMap("credit_payments_status");

        RSortedSet<CreditTransferPaymentStatus>  sortedStatus = status.get(clientRef);

        sortedStatus.forEach(element -> System.out.println(element.getStatusId() + "  " +  element.getStatusDesc() +
                "  " +  element.getTimestamp()));

    }



    public static void main(String[] args) {

        PaymentClient client = new PaymentClient();
        client.run();
        //client.getDataFromCache();







    }


}


