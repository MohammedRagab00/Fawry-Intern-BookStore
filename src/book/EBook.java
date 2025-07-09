package book;

import java.time.LocalDate;

import book.property.E;

public class EBook extends Book implements E {

    private String fileType;

    public EBook(String ISBN, double price, String title, LocalDate year, String fileType) {
        super(ISBN, price, title, year);
        this.fileType = fileType;
    }

    @Override
    public String getFileType() {
        return fileType;
    }

}
