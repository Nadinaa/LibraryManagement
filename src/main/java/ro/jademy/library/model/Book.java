package ro.jademy.library.model;

import java.time.LocalDate;

public class Book {
    public String title;
    public String author;
    public long price;
    public String isbn;
    public int numberOfPages;
    public String genre;
    public LocalDate returnDate;

    public Book(String title, String author, long price, String isbn, int numberOfPages, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
}
