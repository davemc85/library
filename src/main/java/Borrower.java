import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList();
    }



    public int numberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void getBook(Books books){
        this.borrowedBooks.add(books);
    }

    public void getBookFromLibrary(Library library, Books books){
        Books chosenBook = library.removeFromLibrary(books);
        this.getBook(chosenBook);
    }
}
