package edu.handong.csee.java.lab13.prob6;

public class Main { //the class Main

	public static void main(String[] args) { //main method
		UpPoint p1 = new UpPoint(3, 3); //instantiate UpPoint with 3, 3 parameters
		DownPoint p2 = new DownPoint(2, 5); //instantiate DownPoint with 2, 5 parameters
		DownPoint p3 = new DownPoint(4, 7); //instantiate DownPoint with 4, 7 parameters
		UpPoint p4 = new UpPoint(9, 12); //instantiate UpPoint with 9, 12 parameters
		
		Printer.print(p1); //print p1's result
		Printer.print(p2); //print p2's result
		Printer.print(p3); //print p3's result
		Printer.print(p4); //print p4's result
	}

}
