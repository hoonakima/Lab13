package edu.handong.csee.java.lab13.prob1; //package name

public class Friend { //Friend class (Base class)

	private String name; //instance variable
	
	public Friend() { //default constructor
		
		name = ""; //set name value
	}
	
	public Friend(String name) {  //Constructor
		
		this.name = name; //set name as input parameter
	}
	
	public void justFriend() { //define justFriend method
		
		System.out.println("Just Friend!"); //print the line
	}
	
}
