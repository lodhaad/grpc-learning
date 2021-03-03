package com.lodhaad.payment.services.settlements;

import com.lodhaad.payment.execution.datamodel.BaseExecution;
import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;

public interface Settlement  extends BaseExecution {

    public void sendToSettlements(CreditTransferPayment request);
}
