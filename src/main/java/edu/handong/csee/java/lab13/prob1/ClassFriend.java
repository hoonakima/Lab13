package edu.handong.csee.java.lab13.prob1; //package name

public class ClassFriend extends SchoolFriend{ //ClassFriend class inherits SchoolFriend class

	public ClassFriend() { //default constructor
		super();  //call constructor of parent class, SchoolFriend 
	}
	
	public ClassFriend(String name) { //constructor
		super(name); //call constructor of parent class, SchoolFriend
	}
	
	public void classFriend() { //defines classFriend method
		System.out.println("Class Friend!"); //print the line
	}
	
	
}
