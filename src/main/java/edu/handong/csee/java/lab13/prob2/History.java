package edu.handong.csee.java.lab13.prob2; //package name

public class History extends Book{ //History class inherits Book class.
	
	private String author; //it has author data, too.
	
	public History() { //default constructor
		super(); //call base class constructor
		author = "No author name yet"; //set default author data 
		
	}
	
	public History(String bookName, String author) { //constructor
		super(bookName); //call base class constructor
		this.author = author; //set author name as input data
	}

	public String getAuthor() { //getting author name method
		return author; //returns author name
	}

	public void setAuthor(String author) { //setting author name
		this.author = author; //set author name as input data
	}
	
	public void showBookInfo(int i) { //showing book information
		System.out.println(toString()); //print class name
		System.out.println("\t Id: " + i); //print Id number of a book
		System.out.println("\t Book name: " + getBookName()); //print book name
		System.out.println("\t Author: " + author); //print author name
	}

}
