package com.lodhaad.payment.services.validation.dm;

public class CreditPaymentValidationRequest {

    private String clientName;
    private String clientAccount;
    Double amount;
    private String beneName;
    private String benebank;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBeneName() {
        return beneName;
    }

    public void setBeneName(String beneName) {
        this.beneName = beneName;
    }

    public String getBenebank() {
        return benebank;
    }

    public void setBenebank(String benebank) {
        this.benebank = benebank;
    }

    @Override
    public String toString() {
        return "CreditPaymentValidationRequest{" +
                "clientName='" + clientName + '\'' +
                ", clientAccount='" + clientAccount + '\'' +
                ", amount=" + amount +
                ", beneName='" + beneName + '\'' +
                ", benebank='" + benebank + '\'' +
                '}';
    }
}
