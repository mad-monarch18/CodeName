package org.example;

public class Book {
    public int id;
    public String isbn;
    public String title;
    public boolean checkedOut;

    public Book(int id, String isbn, String title, boolean checkedOut){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkedOut = false;
    }
    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }
}
