package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { //the abstract class Shape
	public abstract double makeArea(); //this method hasn't implement in this class because abstract
	public abstract double makePerimeter(); //this method hasn't implement in this class because abstract
	public void display() { //the method display
		System.out.println("Area : " + makeArea() + "\nPerimeter : " + makePerimeter() + "\n"); //prints area and perimeter
	}
}
