package inventory;

import book.Book;

import java.util.HashSet;
import java.util.Set;

public class Inventory {

    private static Inventory Instance;
    private Set<Book> books;

    private Inventory() {
        books = new HashSet<>();
    }

    public static Inventory getInstance() {
        if (Instance == null) {
            Instance = new Inventory();
        }
        return Instance;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
