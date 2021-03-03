package com.lodhaad.payment.services.client.posting;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public class BasePosting implements Posting {
    @Override
    public void sendForPosting(CreditTransferPayment request) {


        if (!this.checkExecution(request,"Fraud")) {
            return ;
        }

        System.out.println("base sending to posting ");
    }
}
