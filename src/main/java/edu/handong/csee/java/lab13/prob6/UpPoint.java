package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrintable { //the class UpPoint following interface CapitalPrintable
	private int x, y; //instance variables
	
	UpPoint(int x, int y) { //constructor has two int parameters
		this.x = x; //instance variable x value is parameter x value
		this.y = y; //instance variable y value is parameter y value
	}
	
	public String toString() { //this method returns String type value
		return "x : " + x + " y : " + y; //returns lower case x and y and values
	} 
}
