package edu.handong.csee.java.lab13.prob6;  //package name

public class UpPoint implements CapitalPrint{ //UpPoint class implements CapitalPrint interface
 
	private int x,y;
	
	public UpPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "X: " + x + "Y: "+ y;
	}
	

}
