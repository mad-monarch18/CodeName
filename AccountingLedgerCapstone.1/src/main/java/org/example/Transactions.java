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
    public static void searchTransactionsByDate(ArrayList<Transactions> transactions, String date){
        boolean found = false;

        System.out.println("Transactions for date: " + date);

        for(Transactions transaction : transactions){
            if (transaction.getDate().equalsIgnoreCase(date)){
                found = true;
                System.out.println("Date: " + transaction.getDate());
                System.out.println("Time: " + transaction.getTime());
                System.out.println("Description: " + transaction.getDescription());
                System.out.println("Vendor: " + transaction.getVendor());
                System.out.println("Amount: " + transaction.getAmount());
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("No transactions found for vendor: " + date);
        }
    }

    public static void searchTransactionsByVendor(ArrayList<Transactions> transactions, String vendor) {
        boolean found = false;

        System.out.println("Transactions for Vendor: " + vendor);

        for (Transactions transaction : transactions) {
            if (transaction.getVendor().equalsIgnoreCase(vendor)) {
                found = true;
                System.out.println("Date: " + transaction.getDate());
                System.out.println("Time: " + transaction.getTime());
                System.out.println("Description: " + transaction.getDescription());
                System.out.println("Vendor: " + transaction.getVendor());
                System.out.println("Amount: " + transaction.getAmount());
                System.out.println();
            }
        }

        if (!found) {
            System.out.println("No transactions found for vendor: " + vendor);
        }
    }
}

