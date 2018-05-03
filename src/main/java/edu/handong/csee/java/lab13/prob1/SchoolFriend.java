package edu.handong.csee.java.lab13.prob1; //package name

public class SchoolFriend extends Friend { //SchoolFriend class inherits Friend class
	
	public SchoolFriend() { //default constructor
		super(); //call constructor of base class, Friend.
	}
	
	public SchoolFriend(String name) { //constructor
		super(name); //call constructor of base class, Friend.
	}
	
	public void schoolFriend() { //defines schoolFriend method
		System.out.println("School Friend!"); //print the line
	}
}
