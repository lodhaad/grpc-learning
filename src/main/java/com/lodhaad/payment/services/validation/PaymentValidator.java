package com.lodhaad.payment.services.validation;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public class PaymentValidator {

    public Boolean validate(CreditTransferPayment payment){

        System.out.println("validation being done ");

        return true;
    }
}
