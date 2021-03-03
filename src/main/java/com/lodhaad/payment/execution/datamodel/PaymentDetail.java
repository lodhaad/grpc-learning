package com.lodhaad.payment.execution.datamodel;

import java.time.LocalDate;

public class PaymentDetail {

    Double amount;
    PaymentCurrency sentCurrency;
    PaymentCurrency reciptCurrency;
    LocalDate settlementDate;
    String paymentType;

    public String getPaymentType() {
        return paymentType;
    }

    public PaymentDetail setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    public PaymentDetail setSettlementDate(LocalDate settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public PaymentDetail setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public PaymentCurrency getSentCurrency() {
        return sentCurrency;
    }

    public PaymentDetail setSentCurrency(PaymentCurrency sentCurrency) {
        this.sentCurrency = sentCurrency;
        return this;
    }

    public PaymentCurrency getReciptCurrency() {
        return reciptCurrency;
    }

    public PaymentDetail setReciptCurrency(PaymentCurrency reciptCurrency) {
        this.reciptCurrency = reciptCurrency;
        return this;
    }


    @Override
    public String toString() {
        return "PaymentDetail{" +
                "amount=" + amount +
                ", sentCurrency=" + sentCurrency +
                ", reciptCurrency=" + reciptCurrency +
                ", settlementDate=" + settlementDate +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
