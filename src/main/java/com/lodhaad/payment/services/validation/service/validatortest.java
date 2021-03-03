package com.lodhaad.payment.services.validation.service;

import com.lodhaad.payment.services.validation.dm.CreditPaymentValidationRequest;

public class validatortest {

    public static void main(String[] args) {

        CreditPaymentValidationRequest request = new CreditPaymentValidationRequest();
        request.setBenebank("HSBC");
        request.setAmount(20.0d);
        request.setBeneName("aditya");

        CreditPaymentValidationRequest request2 = new CreditPaymentValidationRequest();
        request2.setAmount(5d);
        request2.setBenebank("");
        request2.setBeneName("");









        request = Validator.validate(p -> ( p.getBenebank()  != null ),  (
                "bene bank cant be null"))
                //


                .on(request)
                .validate();
        System.out.println(request);

        try {

            request2 = Validator.validate(p ->  p.getAmount() > 0 ,  (
                    "amount cant be null"))
                    .thenValdiate(p -> !p.getBenebank().isEmpty() , "bene bank cant be null")
                    .thenValdiate(p -> !p.getBeneName().isEmpty(),  "Bene nname cannot be null ")

                    .on(request2)
                    .validate();
            System.out.println(request2);

        }catch (Validator.PaymentValidationException exception){

           Throwable[] list =  exception.getSuppressed();

           for (Throwable ele : list){
               System.out.println(ele.getMessage());
           }

        }





    }
}
