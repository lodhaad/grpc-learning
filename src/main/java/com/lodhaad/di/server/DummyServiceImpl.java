package com.lodhaad.di.server;

import com.proto.di.DummyMessage;
import com.proto.di.DummyRequest;
import com.proto.di.DummyResponse;
import com.proto.di.DummyServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DummyServiceImpl  extends DummyServiceGrpc.DummyServiceImplBase {



    @Override
    public void dummyFunction(DummyRequest request, StreamObserver<DummyResponse> responseObserver) {

        DummyMessage message = request.getMessage();

        String  newMessage = message.getName();

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        App app = appContext.getBean("app", App.class);

        app.run();





        DummyResponse response =
                DummyResponse.newBuilder().setMessage(DummyMessage.newBuilder().setName(newMessage).build()).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();


    }
}
