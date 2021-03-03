package com.lodhaad.payment.services.fundavailablity;

import com.lodhaad.di.server.AppConfig;
import com.lodhaad.payment.services.fundavailablity.service.FundControlService;
import com.lodhaad.payment.services.fundavailablity.service.FundControlStatus;
import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferRequest;
import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransferResponse;
import com.proto.payments.fundavailablity.FundAvailablityServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FundAvailablityServiceImpl extends FundAvailablityServiceGrpc.FundAvailablityServiceImplBase {

    @Autowired
    FundControlService service ;

    @Override
    public void checkFundAvailablity(FundAvailablityOnCreditTransferRequest request, StreamObserver<FundAvailablityOnCreditTransferResponse> responseObserver) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        service = appContext.getBean("FundControl", FundControlService.class);

        FundControlStatus status = new FundControlStatus();

        service.checkFunds(request.getFundAvaialblity(), status );

        FundAvailablityOnCreditTransferResponse response =
                FundAvailablityOnCreditTransferResponse.newBuilder().setAvailablityStatus(Boolean.TRUE).build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
