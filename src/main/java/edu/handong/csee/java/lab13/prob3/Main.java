package edu.handong.csee.java.lab13.prob3; //package name

import java.util.Scanner; //import Scanner class

public class Main { //Main class	
		
	public static void main(String[] args) { //starting this program

		Scanner keyboard = new Scanner(System.in); //instantiate Scanner object
		
		
		System.out.print("Enter radius: "); //print the line
		double radius = keyboard.nextDouble(); //get radius value from keyboard
		Circle circle = new Circle(radius); //instantiate Circle object
		System.out.println("Radius: " + radius); //print radius value
		circle.show(); //show the results for circle instance
		
		System.out.print("\nEnter length and width: "); //print the line
		double length = keyboard.nextDouble(); //get length value from keyboard
		double width = keyboard.nextDouble(); //get width value from keyboard
		Rectangle rectangle = new Rectangle(length, width); //instantiate Rectangle object
		System.out.println("Length: " + length); //print length value
		System.out.println("Width: " + width); //print width value
		rectangle.show(); //show the results for rectangle instance
		
		
	}

}
