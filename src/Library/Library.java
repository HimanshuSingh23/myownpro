package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	List<BookItem> books=new ArrayList<>();
	
	
	public void addBook(BookItem bookItem)
	{
		books.add(bookItem);
	}
	
	public List<BookItem> getBooks() {
        return books;
    }
	
	

}
