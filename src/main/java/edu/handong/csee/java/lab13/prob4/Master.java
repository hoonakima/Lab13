package edu.handong.csee.java.lab13.prob4; //package name

public class Master { //defines Master class

	public void feed(Cat cat, Dog dog) { //defines feed method
		
		System.out.println("Name: " + cat.getName()); //print a cat name
		cat.reactToFeed(); //shows cat reaction	
		System.out.println("Name: " + dog.getName()); //print a dog name
		dog.reactToFeed(); //shows dog reaction
		
	}
}
