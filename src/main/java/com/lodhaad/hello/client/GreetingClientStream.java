package com.lodhaad.hello.client;

import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClientStream {




    public void run () {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //doUnaryCall (channel);

        //doServerStreamCall(channel);

        //doClientStreaming(channel);

        doBothSideStreaming(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();



    }

    private void doBothSideStreaming(ManagedChannel channel) {

        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver <GreatEveryoneRequest> request =    asyncClient.greetEveryone(new StreamObserver<GreatEveroneResponse>() {
             @Override
             public void onNext(GreatEveroneResponse value) {
                 System.out.println("Response from Server ");
                 System.out.println(value.getResponse());

             }

             @Override
             public void onError(Throwable t) {

             }

             @Override
             public void onCompleted() {

             }
         } );


         Arrays.asList("Aditya", "Kabir", "kaing","test").forEach( person -> {

             System.out.println("sending message  to  : "+ person );
             request.onNext(GreatEveryoneRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName(person).build()).build());

             try {
                 Thread.sleep(2000);

             }catch (InterruptedException e){

                 e.printStackTrace();

             }

         });


         request.onCompleted();

        System.out.println("completed");

        try {

            latch.await(3L, TimeUnit.SECONDS);
        }catch (InterruptedException e) {

            System.out.println(e.toString());

        }


    }

    private void doClientStreaming (ManagedChannel channel){

        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver <LongGreetRequest> request =    asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse value) {
                System.out.println("got the respponse from Server ");

                System.out.println(value.getResponse());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                System.out.println("got the complete from Server ");
                latch.countDown();

            }
        });


        System.out.println("sending message 1");
        request.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Aditya").build()).build());
        System.out.println("sending message 2");
        request.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Kabir").build()).build());
        System.out.println("sending message 3");
        request.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Ananya").build()).build());

        request.onCompleted();

        System.out.println("completed");

        try {

            latch.await(3L, TimeUnit.SECONDS);
        }catch (InterruptedException e) {

            System.out.println(e.toString());

        }


    }

    private void doUnaryCall(ManagedChannel channel ) {

        GreetServiceGrpc.GreetServiceBlockingStub greetClient =
                GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting = Greeting.newBuilder().setFirstName("Aditya").setLastName("Lodha").build();

        GreetRequest request = GreetRequest.newBuilder().setGreeting(greeting).build();

        GreetResponse response = greetClient.greet(request);

        System.out.println(response.getResult());


    }

    private void doServerStreamCall (ManagedChannel channel) {

        GreetServiceGrpc.GreetServiceBlockingStub greetClient =
                GreetServiceGrpc.newBlockingStub(channel);

        GreetManyTimesRequest request =
                GreetManyTimesRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Aditya").setLastName("Lodha")).build();

        greetClient.greetManyTimes(request).forEachRemaining(greetManyTimesResponse ->  {
            System.out.println(greetManyTimesResponse.getResult());

        });


    }

    public static void main(String[] args) {

        GreetingClientStream client = new GreetingClientStream();
        client.run();







    }


}


