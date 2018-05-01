package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{ //the class Circle which is subclass of Shape class
	private double radius; //instance variable radius
	
	public Circle(double r) { //constructor has double type parameter
		this.radius = r; //instance variable radius vales is r
	}
	
	public double area() { //the method area returns double value
		return Math.PI * Math.pow(radius,  2); //returns pi*r^2, area
	}
	
	public double perimeter() { //the method perimeter returns double value
		return 2 * Math.PI * radius; //returns 2*pi*r, perimeter
	}
	
	public double getRadius() { //the method getRadius returns double value
		return radius; //returns radius
	}
}
