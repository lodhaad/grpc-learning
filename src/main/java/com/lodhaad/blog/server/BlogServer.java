package com.lodhaad.blog.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BlogServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Blog Server starting ");

        Server server = ServerBuilder.forPort(50051).addService(new BlogServiceImpl()).build();

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
