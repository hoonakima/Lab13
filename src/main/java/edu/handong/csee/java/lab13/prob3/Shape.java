package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {

	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public void show() {
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

}
