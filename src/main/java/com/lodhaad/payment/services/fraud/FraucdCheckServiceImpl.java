package com.lodhaad.payment.services.fraud;

import com.proto.payments.fraud.FraudCheckData;
import com.proto.payments.fraud.FraudCheckRequest;
import com.proto.payments.fraud.FraudCheckResponse;
import com.proto.payments.fraud.FraudCheckServiceGrpc;
import io.grpc.stub.StreamObserver;

public class FraucdCheckServiceImpl  extends FraudCheckServiceGrpc.FraudCheckServiceImplBase {

    BaseFraudCheckExecution execution ;

    @Override
    public void fraudCheck(FraudCheckRequest request, StreamObserver<FraudCheckResponse> responseObserver) {

        System.out.println("In Fraud checking ");

        FraudCheckData data = request.getFraudData();

        execution = new BaseFraudCheckExecution();

        boolean result = execution.fraudCheck(data);
        String message = null;

        if (result){
            message = "FRAUD CHECK SUCCESS";
        }

        else {
            message = "FRAUD CHECK FAILURE";
        }

        FraudCheckResponse response =
                FraudCheckResponse.newBuilder().setFraudCheckStatus(result).setSrcRefId(data.getSrcRefid()).
                        setMessage(message).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();











    }
}
