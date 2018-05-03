package edu.handong.csee.java.lab13.prob6;  //package name

public class UpPoint implements CapitalPrint{ //UpPoint class implements CapitalPrint interface
 
	private int x,y; //instance variable
	
	public UpPoint(int x, int y) { //constructor
		this.x = x;  //set x
		this.y = y;  //set y
	}
	
	public String toString() { //define toString method
		return "X: " + x + "Y: "+ y;
	}
	

}
