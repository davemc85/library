import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Books books1;
    Books books2;
    Books books3;
    Books books4;
    Books books5;
    Books books6;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(5);
        books1 = new Books("Harry Potter and The Philosophers Stone", "JK Rowling", "Children");
        books2 = new Books("Harry Potter and The Chamber of Secrets", "JK Rowling", "Children");
        books3 = new Books("Becoming", "Michelle Obama", "Biography");
        books4 = new Books("The Lord of The Rings", "JRR Tolkien", "Fantasy");
        books5 = new Books("The Lion, The Witch and The Wardrobe", "CS Lewis", "Children");
        books6 = new Books("The Da Vinci Code", "Dan Brown", "Thriller");
        borrower = new Borrower();
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(books1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCountBooksInLibrary() {
        library.addBook(books1);
        library.addBook(books2);
        library.addBook(books3);
        library.addBook(books4);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void cantAddBooksIfFull() {
        library.addBook(books1);
        library.addBook(books2);
        library.addBook(books3);
        library.addBook(books4);
        library.addBook(books5);
        library.addBook(books6);
        assertEquals(5, library.bookCount());
    }


    @Test
    public void findBookByIndex(){
        library.addBook(books1);
        library.addBook(books2);
        assertEquals(1, library.findBookByIndex(books2));
    }



    @Test
    public void canRemoveFromLibrary(){
        library.addBook(books1);
        library.addBook(books2);
        library.removeFromLibrary(books1);
        assertEquals(1, library.bookCount());
    }


}
