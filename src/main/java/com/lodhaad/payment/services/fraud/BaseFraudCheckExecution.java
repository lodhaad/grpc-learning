package com.lodhaad.payment.services.fraud;

import com.proto.payments.fraud.FraudCheckData;

import java.util.Random;

public class BaseFraudCheckExecution {

    public boolean fraudCheck(FraudCheckData fraudCheckRequest) {

        String beneAccount = fraudCheckRequest.getBeneAccount();

        Random random =new Random(10);

        if ( random.nextInt() < 9 ) {

            return true;

        }

        return false;
    }
}
