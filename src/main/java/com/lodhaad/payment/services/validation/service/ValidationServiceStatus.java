package com.lodhaad.payment.services.validation.service;

public class ValidationServiceStatus {

    Boolean validationStatus;
    String validationMessage;

    public Boolean getValidationStatus() {
        return validationStatus;
    }

    public ValidationServiceStatus setValidationStatus(Boolean validationStatus) {
        this.validationStatus = validationStatus;
        return this;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public ValidationServiceStatus setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
        return this;
    }
}
