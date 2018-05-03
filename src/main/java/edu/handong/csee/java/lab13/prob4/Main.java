package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name and dog name: ");
		String catName = keyboard.next();
		String dogName = keyboard.next();
		
		
		Cat cat = new Cat(catName);
		Dog dog = new Dog(dogName);
		Master master = new Master();
		
		master.feed(cat, dog);
		
		

	}

}
