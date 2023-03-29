package SystemUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Library.BookItem;
import Library.Library;

public class Librarian {
	

	
	
	
	
	public void addBook(Library lib)
	{
		BookItem bI=new BookItem();
		System.out.println("Enter the BookUniqueIdNumber");
		Scanner sc=new Scanner(System.in);
		String IdNumber=sc.nextLine();
		bI.setUniqueIdNumber(IdNumber);
		System.out.println("Enter the Title of Book");
		Scanner sc1=new Scanner(System.in);
		String title=sc1.nextLine();
		bI.setTitle(title);
		lib.addBook(bI);
	}
	
	
	

	
	

}
