package com.lodhaad.payment.services.validation.service;

import com.lodhaad.payment.services.validation.dm.CreditPaymentValidationRequest;
import com.proto.payments.validation.ValidationRequest;
import org.springframework.stereotype.Service;

@Service("ValidationService")
public class ValidationServImpl implements ValidationServ {
    @Override
    public ValidationRequest validateCreditPayment(ValidationRequest request)  throws RuntimeException {

        CreditPaymentValidationRequest validationRequest = new CreditPaymentValidationRequest();
        validationRequest.setAmount(request.getPayment().getAmount());
        validationRequest.setBenebank(request.getPayment().getBeneBank());
        validationRequest.setBeneName(request.getPayment().getBeneName());

        System.out.println(validationRequest.getBeneName());
        System.out.println(validationRequest.getBenebank());
        System.out.println(validationRequest.getAmount());

        validationRequest = Validator.validate(p -> (p.getAmount() > 0d) , "Amount has to be greater that 0")
                .thenValdiate(p -> !p.getBenebank().isEmpty(), "Bene Bank should not be empty ")
                .thenValdiate(p -> !p.getBeneName().isEmpty(), "Bene name cant be empty ")
                .on(validationRequest).validate();




        return request;



    }
}
