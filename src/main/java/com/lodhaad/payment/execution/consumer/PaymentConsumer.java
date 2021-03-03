package com.lodhaad.payment.execution.consumer;

import com.lodhaad.payment.execution.datamodel.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class PaymentConsumer {


    private MongoClient client = MongoClients.create("mongodb://localhost:27017");
    private MongoDatabase database =  client.getDatabase("blogdb");
    private MongoCollection<Document> collection  = database.getCollection("blog");


    public void insertPayment (CreditTransferPayment payment ){



        PaymentDetail details = payment.getPaymentDetails();

        Double amount = details.getAmount();
        PaymentCurrency currency = details.getReciptCurrency();


        BeneBankDetails beneBankDetails = payment.getBeneBankDetails();

        String beneNank = beneBankDetails.getBeneBankName();
        String address = beneBankDetails.getBranchAddress();


        BeneDetails benedetails  = payment.getBeneDetails();

        String beneAccont = benedetails.getBeneAccount();
        String beneAddress = benedetails.getBeneAddress();

        BranchInformation info = payment.getBranchInformation();

        String branchAddrress = info.getBranchAddress();

        ClientInformation clientInfo = payment.getClientInfo();

        String paymentRef = payment.getPaymentRef();

        String sourceRef = payment.getSourceRef();








    }






        public static void main(String[] args) {
            System.out.println("Kafka consumer ");

            Logger logger = LoggerFactory.getLogger (PaymentConsumer.class.getName());

            Properties consumerProperties = new Properties();
            consumerProperties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
            consumerProperties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                    StringDeserializer.class.getName());
            consumerProperties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                    PaymentDeserializer.class.getName());
            consumerProperties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "credit-payment-application");
            consumerProperties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");


            /// create consumer
            KafkaConsumer<String, CreditTransferPayment> consumer = new KafkaConsumer<String, CreditTransferPayment>(consumerProperties);


            ///subscribe to consumer
            consumer.subscribe(Collections.singleton("credit-payment-topic"));


            //poll for data

            while(true){
                ConsumerRecords<String,CreditTransferPayment> records =consumer.poll(Duration.ofMillis(100));

                for (ConsumerRecord<String, CreditTransferPayment> record : records){
                    //logger.info( "key " + record.key() + "  value " +  record.value());


                   /// PaymentDeserializer deserializer = record.value();


                    System.out.println(record.value() + "record type" + record.value().getClass().getName());

                }
            }
        }


}
