package remove;

import book.Book;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class OutDatedRemoval implements Removal {

    @Override
    public Set<Book> remove(Set<Book> books) {
        return books.stream().filter((book) -> {
            return book.getYear().isAfter(LocalDate.now().plusYears(5));
        }).collect(Collectors.toSet());
    }

}
