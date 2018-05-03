package edu.handong.csee.java.lab13.prob2; //package name

public class Book { //define Book class
	private String bookName; //book name data
	
	public Book() { //default constructor
		bookName = "No name yet"; //set default book name
	}
	
	public Book(String bookName) { //constructor
		this.bookName = bookName;  //set book name as input data
	}
	
	public String getBookName() { //getting book name method
		return bookName; //returns book name
	}

	public void setBookName(String bookName) { //setting book name method
		this.bookName = bookName; //set book name as input data
	}

	public void showBookInfo(int i) { //showing book information method
		System.out.println(toString()); //print the toString return value
		System.out.println("\t Id: " + i); //print Id number
		System.out.println("\t Book Name: " + this.bookName); //print book name
	}
	
	public String toString() { //showing class name method
		return "<<<" + getClass().getSimpleName() + ">>>"; //return class name
	}
}
