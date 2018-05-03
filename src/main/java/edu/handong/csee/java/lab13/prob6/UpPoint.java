package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint{

	private int x,y;
	
	public UpPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "X: " + x + "Y: "+ y;
	}
	

}
