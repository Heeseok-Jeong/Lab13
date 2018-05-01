package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { //the abstract class Shape
	public abstract double area(); //this method hasn't implement in this class because abstract
	public abstract double perimeter(); //this method hasn't implement in this class because abstract
	public void display() { //the method display
		System.out.println("Area : " + area() + "\nPerimeter : " + perimeter() + "\n"); //prints area and perimeter
	}
}
