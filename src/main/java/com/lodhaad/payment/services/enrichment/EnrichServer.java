package com.lodhaad.payment.services.enrichment;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class EnrichServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Hello  Enrichment  gRPC");

        Server server = ServerBuilder.forPort(50053)
                .addService(new BaseEnrichServiceImpl())
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

