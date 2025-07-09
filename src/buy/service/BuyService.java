package buy.service;

import book.Book;
import delivery.Deliver;
import inventory.Inventory;
import validator.Validator;

import java.util.Optional;
import java.util.Set;

public class BuyService {

    private final Inventory inventory;
    private final Set<Validator> validators;
    private final Deliver deliver;

    public BuyService(Inventory inventory, Set<Validator> validators, Deliver deliver) {
        this.inventory = inventory;
        this.validators = validators;
        this.deliver = deliver;
    }

    public double buy(String ISBN) {
        Optional<Book> optionalBook = inventory.getBooks().stream()
                .filter(b -> b.getISBN().equals(ISBN))
                .findFirst();
        if (optionalBook.isEmpty()) {
            throw new IllegalArgumentException("Invalid ISBN");
        }

        Book book = optionalBook.get();
        validate(book);

        return deliver.apply(book);
    }

    private void validate(Book book) {
        validators.forEach(validator ->
                validator.validate(book)
        );
    }
}
