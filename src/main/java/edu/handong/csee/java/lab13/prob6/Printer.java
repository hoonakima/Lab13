package edu.handong.csee.java.lab13.prob6;

public class Printer {
		
	static public void print(Object obj) {
		if(obj instanceof DownPoint) {
			DownPoint downPoint = (DownPoint)obj;
			downPoint.toString();
		}
		else {
			UpPoint upPoint = (UpPoint)obj;
			upPoint.toString();
		}
		
			
	}

}
