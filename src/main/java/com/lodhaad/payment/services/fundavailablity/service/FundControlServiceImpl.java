package com.lodhaad.payment.services.fundavailablity.service;

import com.proto.payments.fundavailablity.FundAvailablityOnCreditTransfer;
import org.springframework.stereotype.Service;

@Service("FundControl")
public class FundControlServiceImpl  implements FundControlService {
    @Override
    public void checkFunds(FundAvailablityOnCreditTransfer availablity, FundControlStatus status) {

        System.out.println(" In funds control");

        String account = availablity.getClientAccount();
        Float amont = availablity.getDebitAmount();






    }
}
