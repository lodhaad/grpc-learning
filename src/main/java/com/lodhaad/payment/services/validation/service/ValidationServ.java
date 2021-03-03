package com.lodhaad.payment.services.validation.service;

import com.proto.payments.validation.ValidationRequest;

public interface ValidationServ {

    public ValidationRequest validateCreditPayment (ValidationRequest request)
            throws RuntimeException;
}
