package com.lodhaad.payment.services.enrichment;

import com.lodhaad.di.server.AppConfig;
import com.lodhaad.payment.services.enrichment.service.EnrichmentService;
import com.lodhaad.payment.services.enrichment.service.EnrichmentServiceStatus;
import com.proto.payments.CreditPaymentRequest;
import com.proto.payments.enrichment.BaseEnrichServiceGrpc;
import com.proto.payments.enrichment.EnrichedBasePayment;
import com.proto.payments.enrichment.EnrichedBasePaymentRequest;
import com.proto.payments.enrichment.EnrichedBasePaymentResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseEnrichServiceImpl extends BaseEnrichServiceGrpc.BaseEnrichServiceImplBase {

    @Autowired
    EnrichmentService enrichmentService;

    @Override
    public void enrichBaseCreditPayment(EnrichedBasePaymentRequest request, StreamObserver<EnrichedBasePaymentResponse> responseObserver) {

        CreditPaymentRequest paymentToBeEnriched = request.getRequest();

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        enrichmentService = appContext.getBean("EnrichmentService", EnrichmentService.class);

        EnrichedBasePayment enrichedData = enrichmentService.enrichPayment(request, new EnrichmentServiceStatus());


        EnrichedBasePaymentResponse enrichedResponse =
                EnrichedBasePaymentResponse.newBuilder().setEnrichedData(enrichedData).setMessage("ENRICHED")
                        .setEnrichmentStatus(true).build();

        responseObserver.onNext(enrichedResponse);

        responseObserver.onCompleted();


    }
}
