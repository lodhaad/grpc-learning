package com.lodhaad.payment.execution.publisher;

import com.lodhaad.payment.execution.service.PaymentProcessingStatus;

public interface StatePublisher {

    void config();

    void publish (PaymentProcessingStatus status);
}
