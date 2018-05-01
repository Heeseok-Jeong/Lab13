package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius,  2);
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
