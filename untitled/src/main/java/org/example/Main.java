package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Age");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Numerator");
            double userInt1 = scanner.nextDouble();
            System.out.println("Enter Denominator");
            double userInt2 = scanner.nextDouble();
            double fraction = userInt1 / userInt2;
            System.out.println("Answer: " + fraction);
        }
        catch(ArithmeticException vari){
            System.out.println("Cant Divide by 0");
        }
        catch (InputMismatchException vari){
            System.out.println("I need a number");
        }

       /* try{
            int userInput = scanner.nextInt();
            System.out.println("You are " + userInput + " years old");
        }

        catch(Exception variable){
            System.out.println("Try Again, Invaild");
        }*/





    }
}