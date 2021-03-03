package com.lodhaad.payment.execution.datamodel;

public class ClientInformation {

    private String clientName;
    private String clientAddress;
    private String clientId;
    private String clientAccount;

    public String getClientAccount() {
        return clientAccount;
    }

    public ClientInformation setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
        return this;
    }

    public String getClientName() {
        return clientName;
    }

    public ClientInformation setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public ClientInformation setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    public String getClientId() {
        return clientId;
    }

    public ClientInformation setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }


    @Override
    public String toString() {
        return "ClientInformation{" +
                "clientName='" + clientName + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientId='" + clientId + '\'' +
                ", clientAccount='" + clientAccount + '\'' +
                '}';
    }
}
