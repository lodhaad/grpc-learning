package com.lodhaad.payment.services.validation;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ValidationServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Hello  Validation gRPC");

        Server server = ServerBuilder.forPort(50052)
                .addService(new ValidationServiceImpl())
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
