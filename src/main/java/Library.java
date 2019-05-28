import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Books> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Books>();
    }


    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Books books) {
        if (this.bookCount() < this.capacity){
            this.books.add(books);
        }
    }

    public int findBookByIndex(Books books) {
        return this.books.indexOf(books);
    }

    public Books removeFromLibrary(Books books){
        int index = this.findBookByIndex(books);
        return this.books.remove(index);
    }

}
