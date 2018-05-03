package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet {
	
	private String food = "Fish";
	
	public Cat(String name) {
		super(name);
	}

	public void reactToFeed() {
		
		System.out.println("feed: (Cat!)" + food);
		
	}

}
