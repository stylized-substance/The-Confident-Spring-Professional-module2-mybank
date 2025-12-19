package org.stylizedsubstance.mybank.model;

import java.util.UUID;

import org.stylizedsubstance.mybank.context.Application;

public class Transaction {
    private String id;
    private int amount; // Monetary amount in cents
    private String timestamp;
    private String reference;

    public Transaction(int amount, String reference) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = Application.dateTimeUtil.createTimeStamp();
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
