package org.example;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> contact;

    public void lookUpContact(String name) {
        if (contact.containsKey(name)) {
            System.out.println(contact.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }

    public void addContact (String name, String phoneNumber){
        contact.put(name,phoneNumber);
    }

    public void removeContact(String name){
        if(contact.containsKey(name)){
            contact.remove(name);
            System.out.println("Contact " +name+" has been removed");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void callContact(String name){
        if(contact.containsKey(name)){
            System.out.println("You are calling: " + contact.get(name));
        }
        else{
            System.out.println("Contact not found");
        }
    }
}