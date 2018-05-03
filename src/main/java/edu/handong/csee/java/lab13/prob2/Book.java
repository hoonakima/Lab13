package edu.handong.csee.java.lab13.prob2;

public class Book {
	private String bookName;
	
	public Book() {
		bookName = "No name yet";
	}
	
	public Book(String bookName) {
		this.bookName = bookName; 
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void showBookInfo(int i) {
		System.out.println(toString());
		System.out.println("\t Id: " + i);
		System.out.println("\t Book Name: " + this.bookName);
	}
	
	public String toString() {
		return "<<<" + getClass().getSimpleName() + ">>>";
	}
}
