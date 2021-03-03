package com.lodhaad.payment.execution.repo;

import com.lodhaad.payment.execution.datamodel.CreditTransferPayment;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("CreditPaymentRepo")
public class CreditPaymentRepoImpl  implements CreditPaymentRepo {

    ///can self implement it as well
    private Map<String,CreditTransferPayment> payments = new HashMap<>();


    @Override
    public List<CreditTransferPayment> findAllCreditPayment() {

        Set<String> paymentIds = payments.keySet();

        List<CreditTransferPayment> listOfAllPayments = new ArrayList<>();

        paymentIds.forEach( (paymentId) -> {

                    listOfAllPayments.add(payments.get(paymentId));

        }

        );
        return listOfAllPayments;
    }

    @Override
    public void save(CreditTransferPayment payment) {



        payments.put(payment.getSourceRef(), payment);



    }
}
