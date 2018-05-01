package edu.handong.csee.java.lab13.prob5;

public class Prob4 { //the class Prob4
	public static boolean equals(int[][] m1, int[][] m2) { //this static method computes two arrays are same and returns a boolean result
		int count = 0; //local variable count
		if(m1.length != m2.length) //if m1's length and m2's length aren't same
			return false;  //returns false
		else { //or not
			for(int i=0; i < m1.length; i++) //repeat m1's length times
				for(int j=0; j < m2.length; j++) //repeat m2's length times
				if (m1[i][j] != m2[i][j]) //if m1[i][j]'s value and m2[i][j]'s value are same
					count++; //plus one count
		}
		
		if(count <= 3) //if count is below than 3
			return true; //return true
		else //or not
			return false; //return false
	}
}
