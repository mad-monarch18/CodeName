package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the monthly payout amount?");
          double pmt = scanner.nextDouble();
        System.out.println("What is the annual interest rate?");
          double annualInterest = scanner.nextDouble();
        System.out.println("How many years will the pay out last?");
          double payLength = scanner.nextDouble();

        double r = annualInterest / 12 / 100;
        double n = payLength * 12;

        double pv = pmt * (1 - Math.pow(1 + r, -n)) / r;

        System.out.println("Present Annuity Value: $" + String.format("%.2f", pv));
    }
}