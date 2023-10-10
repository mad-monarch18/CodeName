package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numerical score.");
        double grade = scanner.nextDouble();

        if(grade >= 90){
            System.out.println("You received an A");
        }
        else if(grade >= 80){
            System.out.println("You received a B");
        }
        else if(grade >= 70){
            System.out.println("You received a C");
        }
        else if(grade >= 60) {
            System.out.println("You received a D");
        }
        else if(grade < 60) {
            System.out.println("You received a F");
        }
    }
}