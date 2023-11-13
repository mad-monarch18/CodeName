package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*ashMap<Variable, Variable> x = new HasMap<>();
        HashMap<String, String> phoneBook = new HashMap<>();


        //add a key value pair
        phoneBook.put("Smith, John A", "(281)558-6587");
        phoneBook.put("Jones, Aaron M", "(401)931-4217");
        //look up something
        String lookUp = phoneBook.get("Smith, John A");
        System.out.println(lookUp);

        //updates value
        phoneBook.put("Smith, Jon A", "(653)368-6157");
        String lookUp2 = phoneBook.get("Smith, John A");
        System.out.println(lookUp2);


        boolean valueIsHashmap = phoneBook.containsValue("(401)931-4217");
        System.out.println(valueIsHashmap);

        //Loop through / display Hashmap
        for(String key : phoneBook.keySet()){
            System.out.println("Key: " + key + "  Value: " + phoneBook.get(key));
        }
*/
        PhoneBook pb = new PhoneBook();

        System.out.println("Welcome to Yellow Book choose an option");
        System.out.println("(1) Look Up Contact");
        System.out.println("(2) Add New Contact");
        System.out.println("(3) Remove Contact");
        System.out.println("(4) Call Contact");
        System.out.println("(5) Quit");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1 -> {
                System.out.println("Enter contact name");
                String name = scanner.nextLine();
                pb.lookUpContact(name);
                break;
            }

            case 2 ->{
                System.out.println("Enter Name");
                String name2 = scanner.nextLine();
                System.out.println("Enter your Number");
                String number2 = scanner.nextLine();
                pb.addContact(name2, number2);
                break;
            }

            case 3 ->{
                System.out.println("Enter the contact you want to call");
                String name3 = scanner.nextLine();
                pb.removeContact(name3);
                System.out.println("Contact Removed: " + name3);
                break;
            }
        }

    }
}