package com.lodhaad.payment.execution.datamodel;

public interface BaseExecution {

    public default Boolean checkExecution(CreditTransferPayment payment, String step) {

        return Boolean.FALSE;
    }
}
