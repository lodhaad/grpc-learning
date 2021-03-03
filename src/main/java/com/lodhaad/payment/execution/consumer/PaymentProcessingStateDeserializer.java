package com.lodhaad.payment.execution.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lodhaad.payment.execution.service.PaymentProcessingStatus;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class PaymentProcessingStateDeserializer  implements Deserializer {
    @Override
    public void configure(Map configs, boolean isKey) {

    }

    @Override
    public PaymentProcessingStatus deserialize(String topic, byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        PaymentProcessingStatus status = null;
        try {
            status = mapper.readValue(data, PaymentProcessingStatus.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return status;
    }

    @Override
    public void close() {

    }
}
