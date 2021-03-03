package com.lodhaad.payment.execution.datamodel;

public class BeneDetails {

    private String beneName;
    private String beneAddress;
    private Boolean isFI;
    private String beneAccount ;

    public String getBeneName() {
        return beneName;
    }

    public BeneDetails setBeneName(String beneName) {
        this.beneName = beneName;
        return this;
    }

    public String getBeneAddress() {
        return beneAddress;
    }

    public BeneDetails setBeneAddress(String beneAddress) {
        this.beneAddress = beneAddress;
        return this;
    }

    public Boolean getFI() {
        return isFI;
    }

    public BeneDetails setFI(Boolean FI) {
        isFI = FI;
        return this;
    }

    public String getBeneAccount() {
        return beneAccount;
    }

    public BeneDetails setBeneAccount(String beneAccount) {
        this.beneAccount = beneAccount;
        return this;
    }

    @Override
    public String toString() {
        return "BeneDetails{" +
                "beneName='" + beneName + '\'' +
                ", beneAddress='" + beneAddress + '\'' +
                ", isFI=" + isFI +
                ", beneAccount='" + beneAccount + '\'' +
                '}';
    }
}
