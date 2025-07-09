package validator;

import book.Book;
import book.PaperBook;

public class StockValidtor implements Validator {

    @Override
    public void validate(Book book) {
        if (book instanceof PaperBook paperBook) {
            if (paperBook.getStock() <= 0) {
                throw new IllegalArgumentException("Book is out of stock");
            }
        }
    }
}
