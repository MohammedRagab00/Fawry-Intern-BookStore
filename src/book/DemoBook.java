package book;

import java.time.LocalDate;

public class DemoBook extends Book {

    public DemoBook(String ISBN, double price, String title, LocalDate year) {
        super(ISBN, price, title, year);
    }
}
