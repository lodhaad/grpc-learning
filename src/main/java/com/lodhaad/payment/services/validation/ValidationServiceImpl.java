package com.lodhaad.payment.services.validation;

import com.lodhaad.di.server.AppConfig;
import com.lodhaad.payment.services.validation.service.ValidationServ;
import com.lodhaad.payment.services.validation.service.Validator;
import com.proto.payments.validation.ValidationRequest;
import com.proto.payments.validation.ValidationResponse;
import com.proto.payments.validation.ValidationServiceGrpc;
import com.proto.payments.validation.ValidationStatus;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValidationServiceImpl  extends ValidationServiceGrpc.ValidationServiceImplBase {


    @Autowired
    ValidationServ service;

    @Override
    public void validateBasePayment(ValidationRequest request, StreamObserver<ValidationResponse> responseObserver) {


        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        service = appContext.getBean("ValidationService", ValidationServ.class);


        System.out.println(" in here validation");

        ValidationResponse response =
                ValidationResponse.newBuilder().build();


        try {

            request = service.validateCreditPayment(request);



            response =
                    response.toBuilder().setVaidationState(ValidationStatus.newBuilder().setValidationStatus(Boolean.TRUE).build()).build();



        }catch (Validator.PaymentValidationException exception) {

            exception.printStackTrace();

            Throwable list[] = exception.getSuppressed();

            ValidationStatus status = ValidationStatus.newBuilder().setValidationStatus(Boolean.FALSE).build();






            for (Throwable ele : list) {

                System.out.println(ele.getMessage());


                status = status.toBuilder().addValidationMessage(ele.getMessage()).build();


            }


            response = response.toBuilder().setVaidationState(status).build();

        }

        finally {

            responseObserver.onNext(response);

            responseObserver.onCompleted();

        }















    }
}
