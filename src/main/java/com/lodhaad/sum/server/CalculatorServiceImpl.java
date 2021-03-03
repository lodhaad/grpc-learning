package com.lodhaad.sum.server;

import com.proto.calculator.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sumTwoNumbers(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        Integer element1 = request.getNumber1();
        Integer element2 = request.getNumber2();

        Integer sum = element1 + element2 ;

        SumResponse response = SumResponse.newBuilder().setSum(sum).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void primeNumberDecomposition(PrimeNumberDecompositionRequest request, StreamObserver<PrimeNumberDecomposionResponse> responseObserver) {

        Integer numberToBeDecomposed = request.getNumber();

        int number = 2 ;

        while (numberToBeDecomposed > 1 ) {

            if (numberToBeDecomposed % number == 0) {

                numberToBeDecomposed = numberToBeDecomposed / number ;

                PrimeNumberDecomposionResponse response =
                        PrimeNumberDecomposionResponse.newBuilder().setNumber(number).build();

                responseObserver.onNext(response);

            }
            else {

                number = number + 1 ;

            }

        }

        responseObserver.onCompleted();





    }


    @Override
    public StreamObserver<AverageNumberReqest> average(StreamObserver<AverageNumberResponse> responseObserver) {

        List<Integer> list =new ArrayList<>();

        StreamObserver<AverageNumberReqest> request = new StreamObserver<AverageNumberReqest>() {



            @Override
            public void onNext(AverageNumberReqest value) {

                Integer requestNumber = value.getNumber();

                list.add(requestNumber);


            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {



                float  sum =  list.stream().reduce(0 , Integer::sum);
                float average = sum  / list.size();

                responseObserver.onNext(AverageNumberResponse.newBuilder().setAverage(average).build());
                responseObserver.onCompleted();

            }
        };


        return request;

    }


    @Override
    public StreamObserver<MaxNumberRequest> maximumStream(StreamObserver<MaxNumberResponse> responseObserver) {


        List<Integer> listInteger = new ArrayList<>() ;

        Map<Integer,Integer> map = new HashMap<>();

        Integer toSend  = 0 ;


        StreamObserver<MaxNumberRequest> request = new StreamObserver<MaxNumberRequest>() {

            @Override
            public void onNext(MaxNumberRequest value) {

                Integer input = value.getNumberInput();

                listInteger.add(input);

                Optional<Integer> maxOpt = listInteger.stream().reduce(Integer::max);

                Integer max = maxOpt.get();

                if (map.containsKey(max)) {
                    ///dont send
                }
                else {

                    /// send it now
                    map.put(input,1);
                    responseObserver.onNext(MaxNumberResponse.newBuilder().setNumberOutput(max).build());


                }




            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onCompleted();

            }
        } ;







        return request;
    }


    @Override
    public void squareRoot(SquareRootInput request, StreamObserver<SquareRootOutput> responseObserver) {

        Integer number = request.getInputForSquare();

        if (number < 0) {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT.withDescription("the number being sent is not positive")
                    .augmentDescription("The number is " + number)
                    .asRuntimeException()
            );
        }
        else {
            Double sqrt = Math.sqrt(number);
            responseObserver.onNext(SquareRootOutput.newBuilder().setSquareRoot(sqrt).build());
            responseObserver.onCompleted();
        }

    }
}
