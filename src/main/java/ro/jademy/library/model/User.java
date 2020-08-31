package ro.jademy.library.model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class User {
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public boolean isAdmin;

    public ArrayList<Book> bookList = new ArrayList<>();

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.userName = userName;
        this.password = password;
    }

    public User(String firstName, String lastName, String userName, String password, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public void printBorrowedBook() {
        for(Book book: bookList) {
            String formattedDate = book.returnDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println("Author: " + book.title + ", title: " + book.author + " and borrowed date: " + formattedDate);
        }
    }

}
