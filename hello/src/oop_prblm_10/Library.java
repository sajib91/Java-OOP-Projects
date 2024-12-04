package oop_prblm_10;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book> ();
    
    public void addBook(Book book) {
    	books.add(book);
    }
    public void removeBook(Book book) {
    	books.remove(book);
    }
    
    public ArrayList<Book> getBooks(){
    	return books;
    }
}
