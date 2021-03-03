package com.lodhaad.payment.client;

import com.proto.payments.CreditPaymentRequest;
import com.proto.payments.CreditPaymentResponse;
import com.proto.payments.PaymentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Random;
import java.util.concurrent.*;

public class PaymentClientNew {




    public void run () {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();


        processPayment(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();



    }

    private void processPayment(ManagedChannel channel) {

        PaymentServiceGrpc.PaymentServiceBlockingStub stub = PaymentServiceGrpc.newBlockingStub(channel);



        ExecutorService service = Executors.newFixedThreadPool(10);


        Callable<CreditPaymentResponse> callable = () -> {


            Random rndom = new Random();
            Double amount = rndom.nextDouble()*10;
            String beneName = "Aditya Lodha";

            if (amount > 8  ){
                beneName = "";
            }

            CreditPaymentRequest  request = CreditPaymentRequest.newBuilder()
                    .setAmount(amount)
                    .setBeneAccount("123456789").
                            setBeneBank("HSBC")
                    .setBeneName(beneName)



                    .setClientAccount("211177")
                    .setClientName("Ananya Lodha")
                    .setCurrency("SGD")
                    .setSrcRef("1234abcd"+(new Random()).nextInt())
                    .build();


            CreditPaymentResponse response = stub.processClientCreditPayment(request);

            //response.getStatusesList().forEach(System.out::println);

            //System.out.println(response.getSrcRef() );

            return response;





        };



        for (int i = 0 ; i < 10 ; i ++ ) {



                        Future<CreditPaymentResponse> threadExec = service.submit(callable);

            try {
                CreditPaymentResponse response = threadExec.get();
                System.out.println(response.getSrcRef());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }


        }

        service.shutdown();








    }






    public static void main(String[] args) {

        PaymentClientNew client = new PaymentClientNew();
        client.run();









    }


}


