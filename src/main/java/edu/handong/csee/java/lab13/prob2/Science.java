package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{
	
	private String publisher;
	
	public Science() {
		super();
		publisher = "No publisher yet";
	}
	
	public Science(String bookName, String publisher) {
		super(bookName);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void showBookInfo(int i) {
		System.out.println(toString());
		System.out.println("\t Id: " + i);
		System.out.println("\t Book Name: " + getBookName()); 
		System.out.println("\t Publisher: " + publisher);
		
	}
	
}
