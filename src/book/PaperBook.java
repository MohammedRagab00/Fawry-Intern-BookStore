package book;

import book.property.Paper;
import java.time.LocalDate;

public class PaperBook extends Book implements Paper {

    private int stock;

    public PaperBook(String ISBN, double price, String title, LocalDate year, int stock) {
        super(ISBN, price, title, year);
        this.stock = stock;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock should be zero or positive");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "stock=" + stock +
                '}';
    }
}
