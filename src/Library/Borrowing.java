package Library;

import java.time.LocalDate;

public class Borrowing {
    public Borrowing(Book book, Subscriber subscriber, LocalDate borrowDate){
        this.book = book;
        this.subscriber = subscriber;
        this.borrowDate = borrowDate;
    }

    private Book book;
    private Subscriber subscriber;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }
}
