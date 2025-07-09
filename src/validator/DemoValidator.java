package validator;

import book.Book;
import book.DemoBook;

public class DemoValidator implements Validator {

    @Override
    public void validate(Book book) {
        if (book instanceof DemoBook) {
            throw new IllegalArgumentException("Book is just for show, not for sale");
        }
    }

}
