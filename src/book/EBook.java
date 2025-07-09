package book;

import book.property.E;

import java.time.LocalDate;

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

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "fileType='" + fileType + '\'' +
                '}';
    }
}
