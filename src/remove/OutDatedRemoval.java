package remove;

import book.Book;
import inventory.Inventory;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class OutDatedRemoval implements Removal {

    @Override
    public Set<Book> remove(Inventory inventory) {
        Set<Book> toBeSaved = new HashSet<>(),
                toBeRemoved = new HashSet<>();

        for (Book book : inventory.getBooks()) {
            if (book.getYear().isBefore(LocalDate.now().minusYears(5))) {
                toBeRemoved.add(book);
            } else {
                toBeSaved.add(book);
            }
        }

        inventory.setBooks(toBeSaved);

        return toBeRemoved;
    }
}
