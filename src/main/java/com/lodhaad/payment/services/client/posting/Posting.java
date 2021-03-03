package com.lodhaad.payment.services.client.posting;

import com.lodhaad.payment.execution.datamodel.BaseExecution;
import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public interface Posting extends BaseExecution {

        public void sendForPosting(CreditTransferPayment request);
}
