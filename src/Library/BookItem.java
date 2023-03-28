package Library;

import java.util.List;

public class BookItem {
	
	private String UniqueIdNumber;
	private String title;
	
	public BookItem(String uniqueIdNumber, String title) {
		this.UniqueIdNumber = uniqueIdNumber;
		this.title = title;
	}

	public String getUniqueIdNumber() {
		return UniqueIdNumber;
	}

	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.UniqueIdNumber = uniqueIdNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookItem() {
	}
	
	
	
	
	
	
	

}
