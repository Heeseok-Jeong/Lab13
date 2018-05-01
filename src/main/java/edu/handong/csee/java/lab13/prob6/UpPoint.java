package edu.handong.csee.java.lab13.prob6;

public class UpPoint { //the class UpPoint
	private int x, y; //instance variables
	
	UpPoint(int x, int y) { //constructor has two int parameters
		this.x = x; //instance variable x value is parameter x value
		this.y = y; //instance variable y value is parameter y value
	}
	
	public String toString() { //this method returns String type value
		return "X : " + x + " Y : " + y; //returns upper case X and Y and values
	} 
}
