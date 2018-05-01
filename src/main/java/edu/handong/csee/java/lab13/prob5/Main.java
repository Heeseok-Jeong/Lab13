package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner; //import a package to use Scanner

public class Main extends Prob4{ //the class Main which is subclass of Prob4 class

	public static void main(String[] args) { //the main method
		int n1 = 0, n2 = 0; //local variables
		
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		System.out.print("Enter row size(max 5)"); //print some message to get row size
		n1 = keyboard.nextInt(); //n1 value gets from user
		System.out.print("Enter column size(max 5)"); //print some message to get column size
		n2 = keyboard.nextInt(); //n2 value gets from user
		int[][] m1 = new int[n1][n2]; //make two-dimentional array m1 size n1, n2
		
		System.out.print("Enter row size(max 5)"); //print some message to get row size
		n1 = keyboard.nextInt(); //n1 value gets from user
		System.out.print("Enter column size(max 5)"); //print some message to get column size
		n2 = keyboard.nextInt(); //n2 value gets from user
		int[][] m2 = new int[n1][n2]; //make two-dimentional array m2 size n1, n2
		
		System.out.print("Enter List1 : "); //print some message
		for(int i=0; i < m1.length; i++) //repeat m1's length times
			for(int j=0; j < m2.length; j++) //repeat m2's length times
				m1[i][j] = keyboard.nextInt(); //m1[i][j]'s value gets from user
		
		System.out.print("Enter List2 : "); //print some message
		for(int i=0; i < m1.length; i++) //repeat m1's length times
			for(int j=0; j < m2.length; j++) //repeat m2's length times
				m2[i][j] = keyboard.nextInt(); //m2[i][j]'s value gets from user
		
		for(int i=0; i < m1.length; i++) { //repeat m1's length times
			for(int j=0; j < m2.length; j++) //repeat m2's length times
				System.out.print(m1[i][j] + " "); //print m1[i][j]'s value
			System.out.println(); //add one line
		}
		System.out.println(); //add one line
		
		for(int i=0; i < m1.length; i++) { //repeat m1's length times
			for(int j=0; j < m2.length; j++) //repeat m2's length times
				System.out.print(m2[i][j] + " "); //print m2[i][j]'s value
			System.out.println(); //add one line
		}
		System.out.println(); //add one line
		
		if(equals(m1, m2)) //if m1 and m2 are equal
			System.out.println("The two arrays are approximately identical."); //print identical message
		else //or not
			System.out.println("The two arrays are not identical."); //print non-identical message
		
		
		
		
		
	}

}
