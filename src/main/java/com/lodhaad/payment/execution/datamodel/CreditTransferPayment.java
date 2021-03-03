package com.lodhaad.payment.execution.datamodel;

import java.io.Serializable;

public class CreditTransferPayment implements Serializable {

    private String paymentRef;

    private String sourceRef;

    private ClientInformation clientInfo;

    private BranchInformation branchInformation;

    private PaymentDetail paymentDetails;

    private BeneDetails beneDetails;

    private BeneBankDetails beneBankDetails;

    public BeneBankDetails getBeneBankDetails() {
        return beneBankDetails;
    }

    public CreditTransferPayment setBeneBankDetails(BeneBankDetails beneBankDetails) {
        this.beneBankDetails = beneBankDetails;
        return this;
    }



    public String getPaymentRef() {
        return paymentRef;
    }

    public CreditTransferPayment setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
        return this;
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public CreditTransferPayment setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    public ClientInformation getClientInfo() {
        return clientInfo;
    }

    public CreditTransferPayment setClientInfo(ClientInformation clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }

    public BranchInformation getBranchInformation() {
        return branchInformation;
    }

    public CreditTransferPayment setBranchInformation(BranchInformation branchInformation) {
        this.branchInformation = branchInformation;
        return this;
    }

    public PaymentDetail getPaymentDetails() {
        return paymentDetails;
    }

    public CreditTransferPayment setPaymentDetails(PaymentDetail paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
    }

    public BeneDetails getBeneDetails() {
        return beneDetails;
    }

    public CreditTransferPayment setBeneDetails(BeneDetails beneDetails) {
        this.beneDetails = beneDetails;
        return this;
    }

    @Override
    public String toString() {
        return "CreditTransferPayment {" +
                "paymentRef='" + paymentRef + '\'' +
                ", sourceRef='" + sourceRef + '\'' +
                ", clientInfo=" + clientInfo +
                ", branchInformation=" + branchInformation +
                ", paymentDetails=" + paymentDetails +
                ", beneDetails=" + beneDetails +
                ", beneBankDetails=" + beneBankDetails +
                '}';
    }
}
