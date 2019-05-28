import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    Library library;
    Books books1;
    Borrower borrower;

    @Before
    public void setUp() {
        library = new Library(5);
        books1 = new Books("Harry Potter and The Philosophers Stone", "JK Rowling", "Children");
        borrower = new Borrower();
    }

    @Test
    public void hasNoBooksToStart() {
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }


    @Test
    public void canGetBook() {
        borrower.getBook(books1);
        assertEquals(1, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void getBookFromLibrary(){
        library.addBook(books1);
        borrower.getBookFromLibrary(library, books1);
        assertEquals(1, borrower.numberOfBorrowedBooks());
        assertEquals(0, library.bookCount());
    }
}