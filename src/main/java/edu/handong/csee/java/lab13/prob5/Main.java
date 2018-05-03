package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int r,c= 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter row size(maximum 5): ");
		r = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c = keyboard.nextInt();
		int[][] a1 = new int[r][c];

		System.out.print("Enter row size(maximum 5): ");
		r = keyboard.nextInt();
		System.out.print("Enter column size(maximum 5): ");
		c = keyboard.nextInt();
		int[][] a2 = new int[r][c]; 

		System.out.print("Enter list1: ");
		for(int i=0; i<a1.length ; i++) {
			for(int j=0; j<a1[i].length; j++)
				a1[i][j] = keyboard.nextInt();
		}
		System.out.print("Enter list2: ");
		for(int i=0; i<a2.length ; i++) {
			for(int j=0; j<a2[i].length; j++)
				a2[i][j] = keyboard.nextInt();
		}

		for(int i=0; i<a1.length ; i++) {
			for(int j=0; j<a1[i].length; j++)
				System.out.print(a1[i][j] + " ");
				System.out.println();
				
		}
		System.out.println();
		
		for(int i=0; i<a2.length ; i++) {
			for(int j=0; j<a2[i].length; j++)
				System.out.print(a2[i][j] + " ");
				System.out.println();
		}
		System.out.println();

		if(equals(a1, a2))
			System.out.println("The two arrays are approximately identical.");
		else
			System.out.println("The two arrays are not identical.");





	}

	public static boolean equals(int[][] a1, int[][] a2) {
		int count =0;

		if(a1.length != a2.length)
			return false;

		for(int i=0; i<a1.length; i++ ) {
			for(int j=0; j<a1[i].length; j++) {
				if(a1[i][j] != a2[i][j])
					count++;
			}
		}
		if(count > 3)
			return false;

		return true;
	}




}
