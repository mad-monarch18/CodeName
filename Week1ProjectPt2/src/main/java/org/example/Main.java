package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Enter the Initial Deposit.");
      double intdeposit = scanner.nextDouble();
    System.out.println("Enter Annual Interest Rate.");
      double annInt = scanner.nextDouble();
    System.out.println("Enter the Number of Years.");
      double numYears = scanner.nextDouble();

    double intRate = annInt / 100;
    double n = 365;
    double fv = intdeposit * Math.pow( 1 + intRate / n, n * numYears);
    double totInt = fv - intdeposit;

    System.out.println("Future Value: $" + String.format("%.2f", fv));
    System.out.println("Interest Earned: $" + String.format("%.2f", totInt));
    }
}