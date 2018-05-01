package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{ //the class Rectangle which is subclass of Shape class
	private double length, width; //instance variable length and width
	
	public Rectangle(double length, double width) { //constructor has two double type parameters
		this.length = length; //instance variable length value is parameter length value
		this.width = width; //instance variable width value is parameter width value
	}
	
	public double area() { //the method area returns double value
		return length * width; //returns length*width, area
	}
	
	public double perimeter() { //the method perimeter returns double value
		return 2 * (length + width); //returns 2*l*w, perimeter
	}
	
	public double getLength() { //the method getLength returns double value
		return length; //returns length
	}
	
	public double getWidth() { //the method getWidth returns double value
		return width; //return width
	}
}
