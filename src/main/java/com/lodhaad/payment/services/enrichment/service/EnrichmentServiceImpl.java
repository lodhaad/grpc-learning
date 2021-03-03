package com.lodhaad.payment.services.enrichment.service;

import com.proto.payments.enrichment.EnrichedBasePayment;
import com.proto.payments.enrichment.EnrichedBasePaymentRequest;
import org.springframework.stereotype.Service;

@Service("EnrichmentService")
public class EnrichmentServiceImpl implements  EnrichmentService {

    @Override
    public EnrichedBasePayment enrichPayment(EnrichedBasePaymentRequest basePayment, EnrichmentServiceStatus statuss) {

        return EnrichedBasePayment.newBuilder()
                .setBeneBankAdress("Hongkong")
                .setBeneBankBIC("HSBCICL")
                .setCountry("HK")
                .setPaymentType("RTP")
                .build();

    }
}
