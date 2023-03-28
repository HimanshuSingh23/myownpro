package Driver;

import java.util.Scanner;

import Library.BookItem;
import SystemUser.Librarian;
import SystemUser.Search;

public class DriverClass {
	
	
	
	public static void UserInterface()
	{
		Librarian l1=new Librarian();
		l1.addBook();
		Search s=new Search();
		s.showBook();
		
		
	}

}
