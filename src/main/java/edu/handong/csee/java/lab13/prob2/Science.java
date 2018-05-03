package edu.handong.csee.java.lab13.prob2; //package name

public class Science extends Book{ //Science class inherits Book class
	
	private String publisher; //it has publisher data, too
	
	public Science() { //default constructor
		super();  //call the constructor of base class
		publisher = "No publisher yet"; //set publisher data like that.
	}
	
	public Science(String bookName, String publisher) { //constructor
		super(bookName); //call the constructor of base class
		this.publisher = publisher; //set publisher as input data
	}

	public String getPublisher() { //getting publisher name method
		return publisher; //returns publisher name
	}

	public void setPublisher(String publisher) { //setting publisher name method
		this.publisher = publisher; //set publisher name as input data
	}

	public void showBookInfo(int i) { //showing book information method. Input i is for counting number of books.
		System.out.println(toString()); //inherited method. It shows class name
		System.out.println("\t Id: " + i); //print Id number of a book
		System.out.println("\t Book Name: " + getBookName()); //print book name
		System.out.println("\t Publisher: " + publisher); //print publisher name
		
	}
	
}
