package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the principal?");
        double principal = scanner.nextDouble();
      System.out.println("Enter the interest rate.");
        double interestRate = scanner.nextDouble();
      System.out.println("How many years is your loan?");
        double loanLength = scanner.nextDouble();

      double intRate = interestRate /12/ 100;
      double length = loanLength * 12;

      double numerator = principal * intRate * Math.pow( 1 + intRate , length);
      double denomenator = Math.pow(1+intRate, length) - 1;
      double mPay = numerator/denomenator;
      double intPay = mPay * length - principal;

      System.out.println("Your Monthly Payment is: $" + String.format("%.2f", mPay));
      System.out.println("Total Interest Paid is: $" + String.format("%.2f", intPay));
    }
}