package com.lodhaad.payment.services.fundavailablity;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FundAvailablityServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Hello  Fund availablity  gRPC");

        Server server = ServerBuilder.forPort(50055)
                .addService(new FundAvailablityServiceImpl())
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
