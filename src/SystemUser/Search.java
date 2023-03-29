package SystemUser;

import java.util.List;

import Library.BookItem;
import Library.Library;

public class Search {
	
	public void showBook(Library lib) {
	    List<BookItem> books = lib.getBooks();
	    System.out.println("The books in the library are as follows:");
	    for(BookItem book : books) {
	        System.out.println("The bookUniqueIDNumber is " + book.getUniqueIdNumber() + ", The bookTitle is " + book.getTitle());
	    }
	}
}
