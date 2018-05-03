package edu.handong.csee.java.lab13.prob4;

public class Master {

	public void feed(Cat cat, Dog dog) {
		
		System.out.println("Name: " + cat.getName());
		cat.reactToFeed();
		System.out.println("Name: " + dog.getName());
		dog.reactToFeed();
		
	}
}
