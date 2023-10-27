package org.example;

import java.util.ArrayList;

public class Transactions {
    private String date;
    private String time;
    private String description;
    private String vendor;
    private String amount;

    public Transactions(String date, String time, String description, String vendor, String amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Date: " + this.date + "\n" +
                "Time: " + this.time + "\n" +
                "Description: " + this.description + "\n" +
                "Vendor: " + this.vendor + "\n" +
                "Amount: $" + this.amount;
    }
}

