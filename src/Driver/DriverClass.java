package Driver;

import java.util.Scanner;

import Library.BookItem;
import Library.Library;
import SystemUser.Librarian;
import SystemUser.Search;

public class DriverClass {
	
	
	
	public static void UserInterface()
	{
		Library lib=new Library();
		for(int i=0;i<3;i++)
		{
		Librarian l1=new Librarian();
		l1.addBook(lib);
		Search s=new Search();
		s.showBook(lib);
		}
		
	}

}
