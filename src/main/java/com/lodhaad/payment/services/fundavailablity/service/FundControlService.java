package com.lodhaad.payment.services.fundavailablity.service;

import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransfer;

public interface FundControlService {

    public void checkFunds (FundAvailablityOnCreditTransfer availablity, FundControlStatus status) ;
}
