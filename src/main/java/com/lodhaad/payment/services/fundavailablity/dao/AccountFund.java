package com.lodhaad.payment.services.fundavailablity.dao;

public class AccountFund {

    String accountId;
    Double CurrentBalance;
    Double availableBalaceForFutureTransactions;
    Double blockedDDueToADebitTransaction;
    Double ToBeSettledOnCredit;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getCurrentBalance() {
        return CurrentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        CurrentBalance = currentBalance;
    }

    public Double getAvailableBalaceForFutureTransactions() {
        return availableBalaceForFutureTransactions;
    }

    public void setAvailableBalaceForFutureTransactions(Double availableBalaceForFutureTransactions) {
        this.availableBalaceForFutureTransactions = availableBalaceForFutureTransactions;
    }

    public Double getBlockedDDueToADebitTransaction() {
        return blockedDDueToADebitTransaction;
    }

    public void setBlockedDDueToADebitTransaction(Double blockedDDueToADebitTransaction) {
        this.blockedDDueToADebitTransaction = blockedDDueToADebitTransaction;
    }

    public Double getToBeSettledOnCredit() {
        return ToBeSettledOnCredit;
    }

    public void setToBeSettledOnCredit(Double toBeSettledOnCredit) {
        ToBeSettledOnCredit = toBeSettledOnCredit;
    }
}
