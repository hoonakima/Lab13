package edu.handong.csee.java.lab13.prob6;  //package name

public class DownPoint implements CapitalPrint { //DownPoint class implements CapitalPrint interface
	
	private int x, y; //instance variable
	
	public DownPoint(int x, int y) { //constructor
		this.x = x; //set x
		this.y = y; //set y
	}
	
	public String toString() { //define the method
		return "x: " + x + "y: "+ y; //return the value
	}
}
