package com.lodhaad.payment.services.validation.service;

import com.lodhaad.payment.services.validation.dm.CreditPaymentValidationRequest;

import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Validator {

    ValidatorSupplier on (CreditPaymentValidationRequest p);

    default Validator thenValdiate (Predicate<CreditPaymentValidationRequest> predicate, String errorMessage ) {

        return p -> {

            try {
                on(p).validate();

                if (predicate.test(p)){
                    return () -> p ;
                }
                else {
                    return () -> {
                        PaymentValidationException exception = new PaymentValidationException("the object i not valid") ;
                        exception.addSuppressed(new IllegalArgumentException(errorMessage));


                        throw  exception;

                    };
                }

            }catch (PaymentValidationException exception){

                if (predicate.test(p)){
                    return () ->  {
                        throw exception;
                    };
                }
                else {
                    exception.addSuppressed(new IllegalArgumentException(errorMessage));
                    return () -> {throw exception; };
                }



            }




        };

    }

    static Validator validate (Predicate<CreditPaymentValidationRequest> predicate, String errorMessage ) {

        return p -> {

            if (predicate.test(p)) {
                return () -> p;

            }
            else {
                return () -> {

                    PaymentValidationException exception = new PaymentValidationException("the object i not valid") ;
                    exception.addSuppressed(new IllegalArgumentException(errorMessage));


                    throw  exception;


                    };
            }

        };
    }

    interface ValidatorSupplier extends Supplier<CreditPaymentValidationRequest> {
        default  CreditPaymentValidationRequest validate () {
            return get();
        }
    }


    class PaymentValidationException extends RuntimeException {
        public PaymentValidationException(String errorMessage) {

            super(errorMessage);
        }
    }
}
