package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[20];
        books[0] = new Book(1212, "isbn-201", "Hunger Games", false);
        books[1] = new Book(2323, "isbn-202", "Crank", false);
        books[2] = new Book(3434, "isbn-203", "Glass", false);
        books[3] = new Book(4545, "isbn-204", "Identical", false);
        books[4] = new Book(5656, "isbn-205", "Of Mice and Men", false);
        books[5] = new Book(6767, "isbn-206", "If you give a Mouse a Cookie", false);
        books[6] = new Book(7878, "isbn-207", "Fault in Our Stars", false);
        books[7] = new Book(8989, "isbn-208", "Diary of a Wimpy Kid Dog Days", false);
        books[8] = new Book(0101, "isbn-209", "No, David", false);
        books[9] = new Book(1111, "isbn-210", "Harry Potter", false);
        books[10] = new Book(2222, "isbn-211", "Spiderwick Chronicles", false);
        books[11] = new Book(3333, "isbn-212", "Impulse", false);
        books[12] = new Book(4444, "isbn-213", "IT", false);
        books[13] = new Book(5555, "isbn-214", "How the Grinch Stole Chirstmas", false);
        books[14] = new Book(6666, "isbn-215", "13 Reasons Why", false);
        books[15] = new Book(7777, "isbn-216", "The Island", false);
        books[16] = new Book(8888, "isbn-217", "A Good Girl's Guide to Murder", false);
        books[17] = new Book(9999, "isbn-218", "Lord of the Flies", false);
        books[18] = new Book(0000, "isbn-219", "The Giver", false);
        books[19] = new Book(1001, "isbn-220", "The House on Mango Street", false);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and last name.");
        String name = scanner.nextLine();

        System.out.println("Available Books:");
        for (int i = 0; i < books.length; i++){
            if(books[i].checkedOut){
                System.out.println("Checked Out: Yes");
            }
            else{
                System.out.println("Checked Out: No");
            }
        }

        System.out.println("Type the name of any available book on the list to check out.");
        String bookChoice = scanner.nextLine();
        System.out.println( name + " you've selected " + bookChoice);

        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookChoice) && !books[i].isCheckedOut()) {
                books[i].checkOut();
                System.out.println(name + ", you've checked out " + bookChoice + ".");
                break;
            } else if (books[i].getTitle().equalsIgnoreCase(bookChoice) && books[i].isCheckedOut()) {
                System.out.println(bookChoice + " is already checked out.");
                break;
            }
        }
    }
}