package com.lodhaad.payment.execution.repo;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

import java.util.List;

public interface CreditPaymentRepo {

    public List<CreditTransferPayment> findAllCreditPayment();

    public void save(CreditTransferPayment payment);
}
