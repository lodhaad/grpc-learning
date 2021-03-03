package com.lodhaad.payment.execution.publisher;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service("PaymentPublisher")
public class PublisherPaymentImpl implements PublisherPayment {

    static final Properties properties = new Properties();

    static {



        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,PaymentProcessingStatusSerializer.class.getName());


    }






    @Override
    public void publishPaymentAfterEnrichment(CreditTransferPayment payment) {

        KafkaProducer<String,CreditTransferPayment> producer = new KafkaProducer<String,CreditTransferPayment>(properties);

        ProducerRecord<String, CreditTransferPayment > record = new ProducerRecord<String, CreditTransferPayment>
                ("credit-payment-topic", payment.getSourceRef(),  payment);

        ///send data and is async
        producer.send(record);


        /// flush and close
        producer.flush();

        producer.close();

    }
}
