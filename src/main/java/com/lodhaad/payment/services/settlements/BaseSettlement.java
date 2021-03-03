package com.lodhaad.payment.services.settlements;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public class BaseSettlement implements Settlement {
    @Override
    public void sendToSettlements(CreditTransferPayment request) {

        if (!this.checkExecution(request,"Fraud")) {
            return ;
        }

        System.out.println("base settlements");
    }
}
