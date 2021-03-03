package com.lodhaad.di.client;


import com.proto.di.DummyMessage;
import com.proto.di.DummyRequest;
import com.proto.di.DummyResponse;
import com.proto.di.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DummyClient {

    public static void main(String[] args) {


        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).
                usePlaintext().build();

        DummyServiceGrpc.DummyServiceBlockingStub service =   DummyServiceGrpc.newBlockingStub(channel);

        DummyRequest request =
                DummyRequest.newBuilder().setMessage(DummyMessage.newBuilder().setName("hello").build()).build();

        DummyResponse response = service.dummyFunction(request);

        System.out.println(response.getMessage());
    }
}
