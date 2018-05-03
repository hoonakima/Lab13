package edu.handong.csee.java.lab13.prob5; //package name

import java.util.Scanner; //import Scanner class

public class Main { //define Main class	

	public static void main(String[] args) { //starts this program

		int r,c= 0; //instance variable
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner

		System.out.print("Enter row size(maximum 5): "); //print the line
		r = keyboard.nextInt(); //get r value
		System.out.print("Enter column size(maximum 5): ");//print the line
		c = keyboard.nextInt(); //get c value
		int[][] a1 = new int[r][c]; //create array instance

		System.out.print("Enter row size(maximum 5): ");//print the line
		r = keyboard.nextInt(); //get r value
		System.out.print("Enter column size(maximum 5): ");//print the line
		c = keyboard.nextInt(); //get c value
		int[][] a2 = new int[r][c]; //create array instance

		System.out.print("Enter list1: ");//print the line
		for(int i=0; i<a1.length ; i++) { //for loop for row
			for(int j=0; j<a1[i].length; j++) //for loop for column
				a1[i][j] = keyboard.nextInt(); //get the values
		}
		System.out.print("Enter list2: ");//print the line
		for(int i=0; i<a2.length ; i++) { //for loop for row
			for(int j=0; j<a2[i].length; j++) //for loop for column
				a2[i][j] = keyboard.nextInt(); //get the values
		}

		for(int i=0; i<a1.length ; i++) { //for loop for row
			for(int j=0; j<a1[i].length; j++) //for loop for column
				System.out.print(a1[i][j] + " "); //print the array elements
				System.out.println();//print enter
				
		}
		System.out.println(); //print enter
		
		for(int i=0; i<a2.length ; i++) { //for loop for row
			for(int j=0; j<a2[i].length; j++) //for loop for column
				System.out.print(a2[i][j] + " "); //print the array elements
				System.out.println(); //print enter
		}
		System.out.println(); //print enter

		if(equals(a1, a2)) //when a1 and a2 is equal
			System.out.println("The two arrays are approximately identical."); //print the line
		else //when a1 and a2 is not equal
			System.out.println("The two arrays are not identical."); //print the line
 




	}

	public static boolean equals(int[][] a1, int[][] a2) { //define equals method
		int count =0; //instance variable

		if(a1.length != a2.length) //if their row length is different
			return false; //return false

		for(int i=0; i<a1.length; i++ ) { //for loop for row 
			for(int j=0; j<a1[i].length; j++) { //for loop for column
				if(a1[i][j] != a2[i][j]) //if their elements are different
					count++; //increase count number
			}
		}
		if(count > 3) //when the count number exceeds 3
			return false; //return false

		return true; //else, return true
	}




}
