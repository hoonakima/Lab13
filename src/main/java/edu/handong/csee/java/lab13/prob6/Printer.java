package edu.handong.csee.java.lab13.prob6;  //package name

public class Printer { //define Printer class
		
	static public void print(Object obj) { //define static print method
		if(obj instanceof DownPoint) { //when the object is DownPoint
			DownPoint downPoint = (DownPoint)obj; //instatiate
			String str = downPoint.toString(); //call toString method
			System.out.println(str);
			
		}
		else { //when the object is UpPoint
			UpPoint upPoint = (UpPoint)obj; //instantiate
			String str =upPoint.toString(); //call toString method
			System.out.println(str);
		}
		
			
	}

}

