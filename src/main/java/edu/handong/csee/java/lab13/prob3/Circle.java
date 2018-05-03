package edu.handong.csee.java.lab13.prob3;  //package name

public class Circle extends Shape{ //Circle class inherits Shape class, which is abstract class.

	private double radius; //it has radius data
	
	public Circle(double radius) { //constructor
		this.radius = radius; //set initial radius value for instance
	}
	
	@Override
	public double getArea() { //getting area, and it is abstract method
		
		return Math.PI * radius * radius; //return area value
		
	}

	@Override
	public double getPerimeter() { //getting perimeter, and it is also abstract method
		
		return 2* Math.PI * radius; //returns perimeter value
	}
	
	

}
