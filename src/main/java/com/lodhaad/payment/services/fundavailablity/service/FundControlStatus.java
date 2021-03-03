package com.lodhaad.payment.services.fundavailablity.service;

public class FundControlStatus {

    Boolean avaiableFunds;
    Boolean blockedFunds ;
    String accountNum;

    public Boolean getAvaiableFunds() {
        return avaiableFunds;
    }

    public void setAvaiableFunds(Boolean avaiableFunds) {
        this.avaiableFunds = avaiableFunds;
    }

    public Boolean getBlockedFunds() {
        return blockedFunds;
    }

    public void setBlockedFunds(Boolean blockedFunds) {
        this.blockedFunds = blockedFunds;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String toString() {
        return "FundControlStatus{" +
                "avaiableFunds=" + avaiableFunds +
                ", blockedFunds=" + blockedFunds +
                ", accountNum='" + accountNum + '\'' +
                '}';
    }
}
