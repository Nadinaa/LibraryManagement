package ro.jademy.library.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    public static final int BORROWED_MAX_TIME = 30;
    public ArrayList<Shelf> shelfList = new ArrayList<>();
    public ArrayList<User> userList = new ArrayList<>();

    public void listBooks() {
        // Genre: SF
        //    - Dune, Frank Herbert (ISBN: 9780593093) - Lei 1500
        // Genre: Classic
        //    - Slaughter House 5, Kurt Vonnegut (ISBN: 9780593223849) - Lei 30
        //    - 1984, George Orwell (ISBN: 97805932112) - Lei 300

        //TODO

        for (Shelf shelf : shelfList) {
            System.out.println("Genre: " + shelf.genre);
            for (Book book : shelf.bookList) {
                System.out.println("        - " + book.title + ", " + book.author);
            }
        }

    }

    public void listBooks(String genre) {
        //TODO: list all books by given library

    }

    public void addBook(Book book) {
        //TODO: add a book to the library
        // steps:
        // if a shelf with the same genre as the book exists, add the book to that shelf
        // else
        // create a new shelf with the same genre as the book
        // add the book to the shelf
        // add the shelf to the library
    }

    public boolean isGenreInLibrary() {
        //TODO: check if there is a shelf with the given genre
        return false;
    }

    public ArrayList<Book> searchByTitle(String title) {
        //TODO: return all the books with the given title
        // question: should it be the full title or just a part??

        return null;
    }

    public ArrayList<Book> searchByAuthor(String author) {
        //TODO: return all the books with the given author
        return null;
    }

    public Book searchByIsbn(String isbn) {

        //TODO: return a single book with the given isbn
        // question: what should we return when no book is found
//        for (Shelf shelf : shelfList) {
//            for (Book book : shelf.bookList) {
//                if (isbn.equals(book.isbn)) {
//                    return book;
//                }
//            }
//        }
        return null;
    }

    public boolean borrowBook(Book book, User user) {
        //TODO: remove the book from the library shelf and add it to the list of borrowed books of the user
        // return true if the book was successfully borrowed

        for (Shelf shelfi : shelfList) {
            for (Book booki : shelfi.bookList) {
                if (booki.isbn.equals(book.isbn)) {
                    booki.returnDate = LocalDate.now().plusDays(BORROWED_MAX_TIME);
                    user.bookList.add(book);
                    shelfi.bookList.remove(book);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean borrowBook(String isbn, User user) {
        // same as above, only check book by ISBN
        Book book = searchByIsbn(isbn);
        return borrowBook(book, user);
    }
}