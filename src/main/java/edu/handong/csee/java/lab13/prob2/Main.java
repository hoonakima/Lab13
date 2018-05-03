package edu.handong.csee.java.lab13.prob2; //package name

public class Main { //define Main class

	public static void main(String[] args) { //starting this program
		Book[] book = new Book[4]; //Book type array, which size is 4, created
		
		book[0] = new Book("Simple Book"); //first element is just book 
		book[1] = new Science("Hello Physics!", "ScienceWorld"); //second one is Science book
		book[2] = new History("What Is history?", "E.H.Carr");//third one is History book
		book[3] = new History("The South Korea", "Judis"); //fourth one is also History book
		
		for(int i = 0; i<book.length; i++) { //it iterates for all book elements
			
			book[i].showBookInfo(i+1); //shows book information for every book elements.
			
		}
		

	}

}
