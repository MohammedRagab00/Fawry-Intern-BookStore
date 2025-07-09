package delivery.dto;

import book.Book;

public record DeliveryDto(
        Book book,
        String value
) {
}
