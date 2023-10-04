package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello would you like to add, subtract, multiply, or divide?");
        String operation = scanner.nextLine();

        System.out.println("Enter in a number.");
        double number = scanner.nextDouble();
        System.out.println("Enter another number.");
        double number2 = scanner.nextDouble();

        double sum1 = (number + number2);
        double sum2 = (number - number2);
        double sum3 = (number * number2);
        double sum4 = (number / number2);

        if(operation.equalsIgnoreCase("add")){
            System.out.println("The answer is " + sum1);
        }
        else if(operation.equalsIgnoreCase("subtract")){
            System.out.println("The answer is " + sum2);
        }
        else if(operation.equalsIgnoreCase("multiply")){
            System.out.println("The answer is " + sum3);
        }
        else if(operation.equalsIgnoreCase("divide")){
            System.out.println("The answer is " + sum4);
        }
        else{
            System.out.println("Invaild");
        }
    }
}