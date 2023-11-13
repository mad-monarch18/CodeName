package org.example;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public void display(){
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while(isRunning){

            System.out.println("Welcome to %s, the best place to buy a car!");
            System.out.println("Select from the following options:");
            System.out.println("0. Exit");
            System.out.println("1. View all vehicles");
            System.out.println("2. Search for vehicles by price");
            System.out.println("3. Search for vehicles by make/model");
            System.out.println("4. Search for vehicles by year");
            System.out.println("5. Search for vehicles by color");
            System.out.println("6. Search for vehicles by milage");
            System.out.println("7. Search for vehicles by vehicleType");
            System.out.println("8. Add a vehicle");
            System.out.println("9. Remove a vehicle");

        }

        try{
            int userInput = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
