package edu.handong.csee.java.lab13.prob2;

public class Main {

	public static void main(String[] args) {
		Book[] book = new Book[4];
		
		book[0] = new Book("Simple Book");
		book[1] = new Science("Hello Physics!", "ScienceWorld");
		book[2] = new History("What Is history?", "E.H.Carr");
		book[3] = new History("The South Korea", "Judis");
		
		for(int i = 0; i<book.length; i++) {
			
			book[i].showBookInfo(i+1);
			
		}
		

	}

}
