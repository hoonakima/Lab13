package edu.handong.csee.java.lab13.prob4; //package name

import java.util.Scanner; //import Scanner class

public class Main { //defines Main class

	public static void main(String[] args) {  //starts this program
		
		Scanner keyboard = new Scanner(System.in); //instantiate
		
		System.out.print("Enter the cat name and dog name: "); //print the line
		String catName = keyboard.next(); //get the cat name
		String dogName = keyboard.next(); //get the dog name
		
		
		Cat cat = new Cat(catName); //instantiate Cat object
		Dog dog = new Dog(dogName); //instantiate Dog object
		Master master = new Master(); //instantiate Master object
		
		master.feed(cat, dog); //call feed method
		
		

	}

}
