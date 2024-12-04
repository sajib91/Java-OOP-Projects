package oop_prblm_10;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book b1 = new Book("java","Sajib");
		Book b2 = new Book("Math","Masud");
		
		library.addBook(b1);
		library.addBook(b2);
		
		System.out.println("Book list of Library: ");
		for(Book book: library.getBooks()) {
			System.out.println(book.getTitle()+" by "+book.getAuthor());
		}

	}

}
