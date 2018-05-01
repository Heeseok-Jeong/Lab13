package edu.handong.csee.java.lab13.prob3;
import java.util.Scanner; //import a package to use Scanner

public class Main { //the class Main
	
	public static void main(String[] args) { //the main method
		double n1, n2; //local variable n1 and n2
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class to get value from user

		System.out.print("Enter radius : "); //print some message to get radius
		n1 = keyboard.nextDouble(); //n1's value gets from user
		Circle c1 = new Circle(n1); //instantiate Circle class
		System.out.println("Radius : " + c1.getRadius()); //print radius
		c1.display(); //show its area and perimeter
		
		System.out.println("Enter length and width : "); //print some message to get length and width
		n1 = keyboard.nextDouble(); //n1's value gets from user
		n2 = keyboard.nextDouble(); //n2's value gets from user
		Rectangle r1 = new Rectangle(n1, n2); //instantiate Rectangle class
		System.out.println("Length : " + r1.getLength()); //print length
		System.out.println("Width : " + r1.getWidth()); //print width
		r1.display(); //show its area and perimeter
	
	
	}

}
