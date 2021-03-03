package com.lodhaad.hello.client;

import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreeetingClient {

    public static void main(String[] args) {
        System.out.println("hello I am a gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("creating stub ");
       // DummyServiceGrpc.DummyServiceBlockingStub syncClient =
              //  DummyServiceGrpc.newBlockingStub(channel);
        // Unary call


        GreetServiceGrpc.GreetServiceBlockingStub greetClient =
                GreetServiceGrpc.newBlockingStub(channel);

        /*
        Greeting greeting = Greeting.newBuilder().setFirstName("Aditya").setLastName("Lodha").build();

        GreetRequest request = GreetRequest.newBuilder().setGreeting(greeting).build();

        GreetResponse response = greetClient.greet(request);

        System.out.println(response.getResult());

    // DummyServiceGrpc.DummyServiceBlockingStub asyncCLient =
        //        DummyServiceGrpc.newFutureStub(channel);

        // do something

         */


        GreetManyTimesRequest request =
                GreetManyTimesRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Aditya").setLastName("Lodha")).build();

        greetClient.greetManyTimes(request).forEachRemaining(greetManyTimesResponse ->  {
            System.out.println(greetManyTimesResponse.getResult());

        });


        System.out.println("Shutting down channel");
        channel.shutdown();
    }


}


