package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> deposits = new ArrayList<>();
        ArrayList<Double> payments = new ArrayList<>();
        ArrayList<Transactions> transactions = new ArrayList<>();
        transactions.add(new Transactions("2023-10-26", "09:15 AM", "Grocery Shopping", "ABC Supermarket", "$50.75"));
        transactions.add(new Transactions("2023-10-25", "12:30 PM", "Gasoline", "XYZ Gas Station", "$35.20"));
        transactions.add(new Transactions("2023-10-24", "03:45 PM", "Dinner with Friends", "The Bistro", "$75.60"));
        transactions.add(new Transactions("2023-10-23", "10:00 AM", "Internet Bill", "Spectrum", "$89.99"));
        transactions.add(new Transactions("2023-10-22", "02:20 PM", "Movie Tickets", "CinemaPlex", "$20.00"));
        transactions.add(new Transactions("2023-10-21", "08:45 AM", "Coffee and Pastry", "Java Cafe", "$8.75"));
        transactions.add(new Transactions("2023-10-20", "06:15 PM", "Clothing Shopping", "Fashion World", "$120.45"));
        transactions.add(new Transactions("2023-10-19", "11:30 AM", "Phone Bill", "Mobile Services Co.", "$45.99"));
        transactions.add(new Transactions("2023-10-18", "04:40 PM", "Gym Membership", "FitLife Gym", "$60.00"));
        transactions.add(new Transactions("2023-10-17", "01:10 PM", "Lunch at Work", "Office Cafeteria", "$10.25"));
        transactions.add(new Transactions("2023-10-16", "07:55 AM", "Haircut", "Salon Elegance", "$25.50"));
        transactions.add(new Transactions("2023-10-15", "05:20 PM", "Electronics Purchase", "Tech Haven", "$399.99"));
        transactions.add(new Transactions("2023-10-14", "09:00 AM", "Home Rent", "Landlord Properties", "$1,200.00"));
        transactions.add(new Transactions("2023-10-13", "12:45 PM", "Car Repair", "AutoTech Garage", "$150.75"));
        transactions.add(new Transactions("2023-10-12", "03:30 PM", "Bookstore Purchase", "Bookworm Books", "$28.50"));
        transactions.add(new Transactions("2023-10-11", "10:25 AM", "Medical Checkup", "Health Clinic", "$75.00"));
        transactions.add(new Transactions("2023-10-10", "07:20 AM", "Breakfast", "Sunrise Diner", "$12.80"));
        transactions.add(new Transactions("2023-10-09", "05:55 PM", "Home Utilities", "Utility Services Inc.", "$150.25"));
        transactions.add(new Transactions("2023-10-08", "01:50 PM", "School Supplies", "ABC Stationery", "$30.40"));
        transactions.add(new Transactions("2023-10-07", "11:15 AM", "Charity Donation", "Hope Foundation", "$50.00"));


        BankAccount customerAccount = new BankAccount(1000);


        while (true) {
            System.out.println("Welcome to your online banking");
            System.out.println("(1) Make a Deposit");
            System.out.println("(2) Make a Withdrawal");
            System.out.println("(3) View Account");
            System.out.println("(4) Exit");


            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1 -> {
                    System.out.println("Enter the amount you want to deposit.");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    customerAccount.deposit(deposit);
                    deposits.add(deposit);
                    System.out.println("Your new balance is: $" + customerAccount.getBalance());
                }
                case 2 -> {
                    System.out.println("Enter the amount you would like to pay.");
                    double payment = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(customerAccount.getBalance());
                    customerAccount.makePayment(payment);
                    payments.add(payment);
                    System.out.println("Your new balance is: $" + customerAccount.getBalance());
                }
                case 3 -> {
                    System.out.println("Your Account Information");
                    System.out.println("Current Balance: $" + customerAccount.getBalance());
                    System.out.println("(A)All Transactions (D)Deposits (P)Payments (R)Reports (H)Home");
                    String ledgerView = scanner.nextLine().toUpperCase();
                    if (ledgerView.equals("D")) {
                        System.out.println("Your Deposits: ");
                        System.out.println(deposits + "n");
                    } else if (ledgerView.equals("A")) {
                        System.out.println("All transactions");
                        System.out.println("Deposits:");
                        for (double dep : deposits) {
                            System.out.println(dep);
                        }
                        System.out.println("Payments:");
                        for (double pay : payments) {
                            System.out.println(pay);
                        }
                    } else if (ledgerView.equals("P")) {
                        System.out.println("Your Payments: ");
                        System.out.println(payments);

                    } else if (ledgerView.equals("R")) {
                        System.out.println("Your Reports");
                        System.out.println("(1)Search  (0)Back");
                        for (int i = 0; i < transactions.size(); i++) {
                            System.out.println((i + 1) + ". " + transactions.get(i));
                        }

                        String reportsOption = scanner.nextLine();


                            switch (reportsOption) {
                            case "1" -> {
                                System.out.println("Input Vendor Name");
                                String vendorInput = scanner.nextLine();
                                searchTransactionsByVendor(transactions, vendorInput);

                            }

                            case "0" -> {
                                break;

                            }
                        }
                    } else if (ledgerView.equals("H")) {
                        return;
                    } else {
                        System.out.println("Invalid Input");
                        return;
                    }
                }
                case 4 -> {
                    System.out.println("Goodbye for now.");
                    return;
                }
            }
        }



    }

    private static void searchTransactionsByVendor(ArrayList<Transactions> transactions, String vendor) {
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