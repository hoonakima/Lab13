package edu.handong.csee.java.lab13.prob4; //package name

public class Cat extends Animal implements Pet { //Cat class inherits Animal class and implements Pet interface
	
	private String food = "Fish"; //cat food is fish
	
	public Cat(String name) { //constructor
		super(name); //call base class constructor
	}

	public void reactToFeed() { //shows reaction to feeding
		
		System.out.println("feed: (Cat!)" + food); //print the line
		
	}

}
