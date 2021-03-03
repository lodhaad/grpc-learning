package com.lodhaad.payment.services.enrichment.service;

public class EnrichmentServiceStatus {

    Boolean enrihmentStatus;
    String message ;


    public Boolean getEnrihmentStatus() {
        return enrihmentStatus;
    }

    public void setEnrihmentStatus(Boolean enrihmentStatus) {
        this.enrihmentStatus = enrihmentStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
