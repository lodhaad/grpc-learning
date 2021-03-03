package com.lodhaad.payment.execution.publisher;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public interface PublisherPayment {

    void publishPaymentAfterEnrichment(CreditTransferPayment payment);
}
