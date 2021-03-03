package com.lodhaad.payment.execution.datamodel;

public class BeneBankDetails {

    private String beneBankName;
    private String branchAddress;
    private String BIC;

    public String getBeneBankName() {
        return beneBankName;
    }

    public BeneBankDetails setBeneBankName(String beneBankName) {
        this.beneBankName = beneBankName;
        return this;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public BeneBankDetails setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
        return this;
    }

    public String getBIC() {
        return BIC;
    }

    public BeneBankDetails setBIC(String BIC) {
        this.BIC = BIC;
        return this;
    }

    @Override
    public String toString() {
        return "BeneBankDetails{" +
                "beneBankName='" + beneBankName + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                ", BIC='" + BIC + '\'' +
                '}';
    }
}
