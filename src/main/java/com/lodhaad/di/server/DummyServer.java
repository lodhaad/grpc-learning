package com.lodhaad.di.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class DummyServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Dummy Server starting ");

        Server server = ServerBuilder.forPort(50051).addService(new DummyServiceImpl()).build();

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

