package oop_prblm_5;
import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
             Book b1 = new Book("java","sajib","0153422355625");
             Book b2 = new Book("Math","masud","014558452522");
             
             Book.addBook(b1);
             Book.addBook(b2);
             
             ArrayList<Book> bookCollection = Book.getBookCollection();
             
             System.out.println("List of the books:");
             for(Book book: bookCollection) {
            	 System.out.println(book.getTitle()+" by "+ book.getAuthor()+" ISBN: "+book.getISBN());
            	 
             }
            Book.removeBook(b1); 
            System.out.println("\n\nList of the books after removing:");
            for(Book book: bookCollection) {
           	 System.out.println(book.getTitle()+" by "+ book.getAuthor()+" ISBN: "+book.getISBN());
           	 
            }
	}

}
