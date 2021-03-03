package com.lodhaad.payment.execution.consumer;

import com.lodhaad.payment.execution.service.PaymentProcessingStatus;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class PaymentStateConsumer {




        public static void main(String[] args) {
            System.out.println("Kafka consumer ");

            Logger logger = LoggerFactory.getLogger (PaymentStateConsumer.class.getName());

            Properties consumerProperties = new Properties();
            consumerProperties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
            consumerProperties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                    StringDeserializer.class.getName());
            consumerProperties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                    PaymentProcessingStateDeserializer.class.getName());
            consumerProperties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "payment-application");
            consumerProperties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");


            /// create consumer
            KafkaConsumer<String, PaymentProcessingStatus> consumer =
                    new KafkaConsumer<String, PaymentProcessingStatus>(consumerProperties);


            ///subscribe to consumer
            consumer.subscribe(Collections.singleton("payment_topic"));


            //poll for data

            while(true){
                ConsumerRecords<String,PaymentProcessingStatus> records =consumer.poll(Duration.ofMillis(100));

                for (ConsumerRecord<String, PaymentProcessingStatus> record : records){
                    logger.info( "key " + record.key() + "  value " +  record.value());

                    System.out.println(record.value());

                }
            }
        }


}
