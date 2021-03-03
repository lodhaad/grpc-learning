package com.lodhaad.payment.execution.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class PaymentDeserializer implements Deserializer {




    @Override
    public void configure(Map configs, boolean isKey) {

    }

    @Override
    public CreditTransferPayment deserialize(String topic, byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        CreditTransferPayment payment = null;
        try {
            payment = mapper.readValue(data, CreditTransferPayment.class);
           /// this.payment = payment;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return payment;
    }

    @Override
    public void close() {

    }
}
