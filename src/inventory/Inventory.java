package inventory;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

public class Inventory {

    Set<Book> books;

    public Inventory() {
        books = new HashSet<>();
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
