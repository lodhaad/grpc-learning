package com.lodhaad.hello.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl  extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //super.greet(request, responseObserver);

        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();
        String lastName = greeting.getLastName();

        String result = "Hello " + firstName ;

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);

        ///complete the rpc
        responseObserver.onCompleted();


    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        //super.greetManyTimes(request, responseObserver);

        Greeting greeting = request.getGreeting();

        String firstName = greeting.getFirstName();

        try {

            for (int i = 0 ; i < 10 ; i ++ ){
                String responseString = " Hello " + firstName + " " + i ;
                GreetManyTimesResponse response = GreetManyTimesResponse.
                        newBuilder().
                        setResult(responseString)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }

        }
        catch (InterruptedException e){

        }
        finally {
            responseObserver.onCompleted();
        }






    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        StreamObserver<LongGreetRequest> request = new StreamObserver<LongGreetRequest>() {

            String result = "";
            @Override
            public void onNext(LongGreetRequest value) {

                result = result + ". Hello " + value.getGreeting().getFirstName() + " !";

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                /// this
                responseObserver.onNext(LongGreetResponse.newBuilder().setResponse(result).build());
                responseObserver.onCompleted();


            }
        };

            return request;
    }


    @Override
    public StreamObserver<GreatEveryoneRequest> greetEveryone(StreamObserver<GreatEveroneResponse> responseObserver) {

        StreamObserver<GreatEveryoneRequest> greetEveroneRequest = new StreamObserver<GreatEveryoneRequest>() {
            @Override
            public void onNext(GreatEveryoneRequest value) {

                String response = " Hello " + value.getGreeting().getFirstName();

                GreatEveroneResponse everyOneResponse = GreatEveroneResponse.newBuilder().setResponse(response).build();
                responseObserver.onNext(everyOneResponse);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onCompleted();

            }
        };

        return greetEveroneRequest;
    }
}
