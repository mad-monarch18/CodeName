package org.example;

import java.io.FileWriter;
import java.io.IOException;
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

    private static void writeTransactionsToFile(ArrayList<Transactions> transactions, String filePath) throws IOException {
        FileWriter transactionWriter = new FileWriter(filePath);
        transactionWriter.write("Date|Time|Description|Vendor|Amount" + "\n");

        for (Transactions transaction : transactions) {
            transactionWriter.write(transaction.getDate() + " " + transaction.getTime() + " " +
                    transaction.getDescription() + " " + transaction.getVendor() + " " + transaction.getAmount() + "\n");
        }

        transactionWriter.close();
    }
    catch (IOException ex) {
         // Print the exception details for debugging
        System.out.println("Oops, something went wrong: ");
    }


}
