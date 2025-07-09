package book;

import java.time.LocalDate;

public abstract class Book {

    private String ISBN;
    private String title;
    private LocalDate year;
    private double price;

    public Book(String ISBN, double price, String title, LocalDate year) {
        setISBN(ISBN);
        setPrice(price);
        this.title = title;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public final void setISBN(String ISBN) {
        if (ISBN == null) {
            throw new IllegalArgumentException("ISBN cannot be null");
        }
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public final void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price should be positive");
        }
        this.price = price;
    }

}
