package edu.handong.csee.java.lab13.prob3;  //package name

public abstract class Shape { //Shape is abstract class

	public abstract double getArea();  //it has getArea abstract method
	
	public abstract double getPerimeter(); //it has getPerimeter abstract method
	
	public void show() { //showing result
		System.out.println("Area: " + getArea());  //print area value
		System.out.println("Perimeter: " + getPerimeter()); //print perimeter value
	}

}
