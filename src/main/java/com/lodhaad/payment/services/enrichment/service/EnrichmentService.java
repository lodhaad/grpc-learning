package com.lodhaad.payment.services.enrichment.service;

import com.proto.payments.enrichment.EnrichedBasePayment;
import com.proto.payments.enrichment.EnrichedBasePaymentRequest;

public interface EnrichmentService {

    public EnrichedBasePayment enrichPayment (EnrichedBasePaymentRequest basePayment, EnrichmentServiceStatus statuss);
}
