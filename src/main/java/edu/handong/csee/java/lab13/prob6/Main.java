package edu.handong.csee.java.lab13.prob6;  //package name

public class Main { //Main class

	public static void main(String[] args) { //starts this program
		
		UpPoint p1 = new UpPoint(3, 3); //create UpPoint instance
		DownPoint p2 = new DownPoint(2, 5); //create DownPoint instance
		DownPoint p3 = new DownPoint(4, 7); //create DownPoint instance
		UpPoint p4 = new UpPoint(9, 12); //create UpPoint instance
		
		Printer.print(p1); //call print for p1
		Printer.print(p2); //call print for p1
		Printer.print(p3); //call print for p1
		Printer.print(p4); //call print for p1

	}

}
