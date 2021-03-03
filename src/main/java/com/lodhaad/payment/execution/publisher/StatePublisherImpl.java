package com.lodhaad.payment.execution.publisher;

import com.lodhaad.payment.execution.service.PaymentProcessingStatus;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service("KafkaPublisher")
public class StatePublisherImpl implements  StatePublisher {


    static final Properties properties = new Properties();

    static {



        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,PaymentProcessingStatusSerializer.class.getName());


    }

    @Override
    public void config() {

        System.out.println("All configurations done");

    }

    @Override
    public void publish(PaymentProcessingStatus status) {

        KafkaProducer<String,PaymentProcessingStatus> producer = new KafkaProducer<String,PaymentProcessingStatus>(properties);

        ProducerRecord<String, PaymentProcessingStatus > record = new ProducerRecord<String, PaymentProcessingStatus>
                ("payment_topic", status.getPaymentRefId(),  status);

        ///send data and is async
        producer.send(record);


        /// flush and close
        producer.flush();

        producer.close();



    }


}
