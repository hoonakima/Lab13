package edu.handong.csee.java.lab13.prob5;

public class Prob4 {
	
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
