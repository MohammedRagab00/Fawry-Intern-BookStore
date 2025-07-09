import book.Book;
import book.EBook;
import book.PaperBook;
import buy.service.BuyService;
import delivery.Deliver;
import inventory.Inventory;
import remove.OutDatedRemoval;
import validator.DemoValidator;
import validator.StockValidator;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = Inventory.getInstance();
        inventory.setBooks(Set.of(
                new PaperBook("ayHag", 10, "title", LocalDate.of(1010, 2, 2), 4),
                new EBook("tanHag", 20.32, "title", LocalDate.of(1010, 2, 2), ".docx")
        ));
        BuyService buyService = getBuyService(inventory, "<AY_HAG>");
        System.out.printf("Price for buying ayHag book: %f\n\n", buyService.buy("ayHag"));
        System.out.printf("Price for buying tanHag book: %f\n\n", buyService.buy("tanHag"));

        Set<Book> remove = new OutDatedRemoval().remove(inventory);
        System.out.println("*** Removed Books ***");
        remove.forEach(System.out::println);
    }

    public static BuyService getBuyService(Inventory inventory, String value) {
        return new BuyService(inventory, Set.of(new DemoValidator(), new StockValidator()), new Deliver(value));
    }
}
