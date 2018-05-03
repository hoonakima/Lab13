package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = keyboard.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println("Radius: " + radius);
		circle.show();
		
		System.out.print("\nEnter length and width: ");
		double length = keyboard.nextDouble();
		double width = keyboard.nextDouble();
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		rectangle.show();
		
		
	}

}
