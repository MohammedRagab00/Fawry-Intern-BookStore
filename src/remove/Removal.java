package remove;

import book.Book;
import inventory.Inventory;

import java.util.Set;

public interface Removal {

    Set<Book> remove(Inventory inventory);
}
