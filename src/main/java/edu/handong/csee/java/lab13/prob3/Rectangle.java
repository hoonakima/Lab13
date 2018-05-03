package edu.handong.csee.java.lab13.prob3;  //package name

public class Rectangle extends Shape{ //Rectangle class inherits Shape class which is abstract class.

	private double length; //it has length data
	private double width;  //it has width data
	
	public Rectangle(double length, double width) { //constructor
		this.length = length; //set initial length value for an instance
		this.width = width;  //set initial width value for an instance
	}
	
	@Override
	public double getArea() { //abstract method getting area value
		return length*width; //return area value
	}

	@Override
	public double getPerimeter() { //abstract method getting perimeter value
		return 2*(length + width); //return perimeter value
		
	}

}
