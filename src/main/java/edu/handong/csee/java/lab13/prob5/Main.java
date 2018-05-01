package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Main extends Prob4{

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter row size(max 5)");
		n1 = keyboard.nextInt();
		System.out.print("Enter column size(max 5)");
		n2 = keyboard.nextInt();
		int[][] m1 = new int[n1][n2];
		
		System.out.print("Enter row size(max 5)");
		n1 = keyboard.nextInt();
		System.out.print("Enter column size(max 5)");
		n2 = keyboard.nextInt();
		int[][] m2 = new int[n1][n2];
		
		System.out.print("Enter List1 : ");
		for(int i=0; i < m1.length; i++)
			for(int j=0; j < m2.length; j++)
				m1[i][j] = keyboard.nextInt();
		
		System.out.print("Enter List2 : ");
		for(int i=0; i < m1.length; i++)
			for(int j=0; j < m2.length; j++)
				m2[i][j] = keyboard.nextInt();
		
		for(int i=0; i < m1.length; i++) {
			for(int j=0; j < m2.length; j++)
				System.out.print(m1[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < m1.length; i++) {
			for(int j=0; j < m2.length; j++)
				System.out.print(m2[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		
		if(equals(m1, m2))
			System.out.println("The two arrays are approximately identical.");
		else
			System.out.println("The two arrays are not identical.");
		
		
		
		
		
	}

}
