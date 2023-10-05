package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Weather like Today?");
        String weather = scanner.nextLine();

        if(weather.equalsIgnoreCase("Sunny")){
            System.out.println("It's a great day for outdoor activities, get active!");
        }
        else if(weather.equalsIgnoreCase("Rainy")){
            System.out.println("Don't get wet, make sure to bring an umbrella!");
        }
        else if(weather.equalsIgnoreCase("Cloudy")){
            System.out.println("The weather is a bit uncertain.");
        }
        else{
            System.out.println("Sorry, I'm not sure about that type.");
        }
    }
}