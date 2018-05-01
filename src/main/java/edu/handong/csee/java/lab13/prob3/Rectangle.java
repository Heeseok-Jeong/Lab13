package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2 * (length + width);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
}
