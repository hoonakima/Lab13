package edu.handong.csee.java.lab13.prob2;

public class History extends Book{
	
	private String author;
	
	public History() {
		super();
		author = "No author name yet";
		
	}
	
	public History(String bookName, String author) {
		super(bookName);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo(int i) {
		System.out.println(toString());
		System.out.println("\t Id: " + i);
		System.out.println("\t Book name: " + getBookName());
		System.out.println("\t Author: " + author);
	}

}
