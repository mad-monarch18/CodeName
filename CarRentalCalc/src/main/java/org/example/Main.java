package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your pickup date? 00/00/00");
        String day = scanner.nextLine();

        System.out.print("What is the number of days you will have the car?");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add gps for $2.95/day? (Yes/No)");
        String gps = scanner.nextLine();

        System.out.println("Add toll tag for $3.95/day? (Yes/No)");
        String roadside = scanner.nextLine();

        System.out.println("Add roadside for $3.95/day? (Yes/No)");
        String tollTag = scanner.nextLine();

        double carRate = (29.99 * days);

        double ageFee = 0;
               if(age < 25){
                 ageFee = (.30 * days);
        }

        double gpsFee = 0;
                if(gps.equalsIgnoreCase("Yes")){
                  gpsFee = (2.95 * days);
                }

        double roadFee = 0;
               if(roadside.equalsIgnoreCase("Yes")){
                 roadFee = (3.95 * days);
        }

        double tollFee = 0;
               if(tollTag.equalsIgnoreCase("Yes")){
                 tollFee = (3.95 * days);
        }

        double total = tollFee + roadFee + gpsFee + ageFee + carRate;
        System.out.println("Pickup Date: " + day);
        System.out.println("Car Rate: $" + String.format("%.2f",carRate));
        System.out.println("Underage Fee: $" + String.format("%.2f",ageFee));
        System.out.println("GPS Fee: $" + String.format("%.2f", gpsFee));
        System.out.println("Roadside Fee: $" + String.format("%.2f",roadFee));
        System.out.println("Toll Tag Fee: $" + String.format("%.2f",tollFee));
        System.out.println("Total Cost: $" + String.format("%.2f",total));

    }
}