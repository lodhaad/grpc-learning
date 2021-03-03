package com.lodhaad.payment.execution.datamodel;

import java.io.Serializable;
import java.time.Instant;

public class CreditTransferPaymentStatus implements Comparable<CreditTransferPaymentStatus>, Serializable {

    private Integer statusId;
    private String statusDesc;
    private Instant timestamp;

    public Integer getStatusId() {
        return statusId;
    }

    public CreditTransferPaymentStatus setStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public CreditTransferPaymentStatus setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public CreditTransferPaymentStatus setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    @Override
    public int compareTo(CreditTransferPaymentStatus o) {

        return this.getStatusId().compareTo(o.getStatusId());
    }
}
