package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{
	
	private String food = "Sausage";
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void reactToFeed() {
		
		System.out.println("feed: (Dog!)" + food);
	}

}
