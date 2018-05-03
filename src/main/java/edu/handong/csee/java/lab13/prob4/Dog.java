package edu.handong.csee.java.lab13.prob4; //package name

public class Dog extends Animal implements Pet{  //Cat class inherits Animal class and implements Pet interface
	
	private String food = "Sausage"; //Dog food is sausage
	
	public Dog(String name) { //constructor
		super(name); //call base class constructor
	}

	@Override
	public void reactToFeed() { //shows reaction to feeding
		
		System.out.println("feed: (Dog!)" + food); //print the line
	}

}
