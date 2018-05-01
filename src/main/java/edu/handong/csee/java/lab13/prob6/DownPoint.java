package edu.handong.csee.java.lab13.prob6;

public class DownPoint { //the class DownPoint
	private int x, y; //instance variables
	
	DownPoint(int x, int y) { //constructor has two int parameters
		this.x = x; //instance variable x value is parameter x value
		this.y = y; //instance variable y value is parameter y value
	}
	
	public String toString() { //this method returns String type value
		return "x : " + x + " y : " + y; //returns down case x and y and values
	} 
}
