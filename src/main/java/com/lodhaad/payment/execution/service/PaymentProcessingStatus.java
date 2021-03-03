package com.lodhaad.payment.execution.service;

public class PaymentProcessingStatus  {

    private Boolean paymentProcessingStatus;
    private String message;
    private String processingStep ;
    private String paymentRefId ;

    public String getPaymentRefId() {
        return paymentRefId;
    }

    public void setPaymentRefId(String paymentRefId) {
        this.paymentRefId = paymentRefId;
    }

    public PaymentProcessingStatus() {

    }

    public PaymentProcessingStatus(Boolean paymentProcessingStatus, String message, String processingStep) {
        this.paymentProcessingStatus = paymentProcessingStatus;
        this.message = message;
        this.processingStep = processingStep;
    }

    public Boolean getPaymentProcessingStatus() {
        return paymentProcessingStatus;
    }

    public void setPaymentProcessingStatus(Boolean paymentProcessingStatus) {
        this.paymentProcessingStatus = paymentProcessingStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProcessingStep() {
        return processingStep;
    }

    public void setProcessingStep(String processingStep) {
        this.processingStep = processingStep;
    }

    @Override
    public String toString() {
        return "PaymentProcessingStatus{" +
                "paymentProcessingStatus=" + paymentProcessingStatus +
                ", message='" + message + '\'' +
                ", processingStep='" + processingStep + '\'' +
                ", paymentRefId='" + paymentRefId + '\'' +
                '}';
    }
}
