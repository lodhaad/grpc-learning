package com.lodhaad.payment.execution.datamodel;

public class BranchInformation {

    private String branchId;
    private String branchCode;
    private String branchAddress ;

    public String getBranchId() {
        return branchId;
    }

    public BranchInformation setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public BranchInformation setBranchCode(String branchCode) {
        this.branchCode = branchCode;
        return this;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public BranchInformation setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
        return this;
    }

    @Override
    public String toString() {
        return "BranchInformation{" +
                "branchId='" + branchId + '\'' +
                ", branchCode='" + branchCode + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                '}';
    }
}
