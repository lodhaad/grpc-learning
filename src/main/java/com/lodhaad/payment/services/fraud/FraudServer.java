package com.lodhaad.payment.services.fraud;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FraudServer {

    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.println("Hello  Fraud Check  gRPC");

        Server server = ServerBuilder.forPort(50054)
                .addService(new FraucdCheckServiceImpl())
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
