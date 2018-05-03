package edu.handong.csee.java.lab13.prob6;  //package name

public class DownPoint implements CapitalPrint { //DownPoint class implements CapitalPrint interface
	
	private int x, y;
	
	public DownPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + "y: "+ y;
	}
}
