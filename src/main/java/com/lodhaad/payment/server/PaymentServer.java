package com.lodhaad.payment.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PaymentServer {


    public static void main(String[] args)  throws Exception {
        System.out.println("Hello  Payment gRPC");

        Server server = ServerBuilder.forPort(50051)
                .addService(new BasePaymentServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {

            System.out.println("received Shutdown request");

            server.shutdown();

            System.out.println("Server shutdown");

        }


        ));

        server.awaitTermination();
    }
    }

