package com.lodhaad.sum.client;


import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalclulatorClient {

    public void run() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

       // add (channel);

       // primeNumberDecomposition(channel);

       // average(channel);

       // maxInNumbersSentTillNow(channel);

        sqrt(channel);

        ///shut down the server
        channel.shutdown();




    }


    public void sqrt (ManagedChannel channel ) {
        System.out.println(" Starting client ");

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub =
                CalculatorServiceGrpc.newBlockingStub(channel);

        SquareRootInput input = SquareRootInput.newBuilder().setInputForSquare(-10).build();

        SquareRootOutput response ;

        try {

            response = stub.squareRoot(input);

        }catch (StatusRuntimeException exception){

            exception.printStackTrace();

        }





    }


    public void add (ManagedChannel channel ) {
        System.out.println(" Starting client ");

           CalculatorServiceGrpc.CalculatorServiceBlockingStub stub =
                CalculatorServiceGrpc.newBlockingStub(channel);

        SumRequest request = SumRequest.newBuilder().setNumber1(20).setNumber2(40).build();

        SumResponse response = stub.sumTwoNumbers(request);

        System.out.println("the result from the server is " +response.getSum() );


    }


    public void primeNumberDecomposition (ManagedChannel channel ) {
        System.out.println(" Starting client ");

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub =
                CalculatorServiceGrpc.newBlockingStub(channel);

        stub.primeNumberDecomposition(PrimeNumberDecompositionRequest.newBuilder().setNumber(120).build()).forEachRemaining(
                element -> {
                    System.out.println(element);
                }

        );




    }


    public void average (ManagedChannel channel ) {
        System.out.println(" Starting client ");

        CalculatorServiceGrpc.CalculatorServiceStub stub =
                CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<AverageNumberReqest> request =  stub.average(new StreamObserver<AverageNumberResponse>() {
            @Override
            public void onNext(AverageNumberResponse value) {

                System.out.println("this is the average " + value.getAverage());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                System.out.println("got the complete from server ");
                latch.countDown();

            }
        });



        List<Integer> allElements  = Arrays.asList(1, 4, 6 ,8 );

        allElements.forEach( element -> {
            request.onNext(AverageNumberReqest.newBuilder().setNumber(element).build());
        });

        request.onCompleted();


        try {

            latch.await(3L, TimeUnit.SECONDS);
        }catch (InterruptedException e) {

            System.out.println(e.toString());

        }








    }



    public void maxInNumbersSentTillNow (ManagedChannel channel ) {

        System.out.println(" Starting client ");

        CalculatorServiceGrpc.CalculatorServiceStub stub =
                CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<MaxNumberRequest> request =  stub.maximumStream(new StreamObserver<MaxNumberResponse>() {
            @Override
            public void onNext(MaxNumberResponse value) {

                System.out.println(value.getNumberOutput());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });



        List<Integer> allElements  = Arrays.asList(1, 4, 6 ,2 ,6,  5 ,8 );

        allElements.forEach( element -> {
            request.onNext(MaxNumberRequest.newBuilder().setNumberInput(element).build());
        });

        request.onCompleted();


        try {

            latch.await(3L, TimeUnit.SECONDS);
        }catch (InterruptedException e) {

            System.out.println(e.toString());

        }




    }





    public static void main(String[] args) {

        CalclulatorClient client = new CalclulatorClient();
        client.run();


    }
}
