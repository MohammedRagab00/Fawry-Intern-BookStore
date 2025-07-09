package delivery;

import book.Book;
import delivery.dto.DeliveryDto;
import delivery.service.MailService;
import delivery.service.ShippingService;

import java.util.function.Function;

public class Deliver implements Function<Book, Double> {
    private final String value;

    public Deliver(String value) {
        this.value = value;
    }

    @Override
    public Double apply(Book book) {
        DeliveryDto dto = new DeliveryDto(book, value);
        switch (book.getClass().getSimpleName()) {
            case "PaperBook":
                System.out.printf("Delivery on the way to address: %s\n", value);
                new ShippingService().apply(dto);
                break;
            case "EBook":
                System.out.printf("Email is sent to: %s\n", value);
                new MailService().apply(dto);
                break;
        }

        return book.getPrice();
    }
}
