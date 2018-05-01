package edu.handong.csee.java.lab13.prob6;

public class Printer { //the class Printer
	public static void print(Object object) { //the static method print has a Object(ultimate superclass) parameter
		String str = object.toString(); //String type local variable value is each object's toString return value 
		if(object instanceof CapitalPrintable) //if object is subclass of CapitalPrintable class
			str = str.toUpperCase(); //str value changes to upper cases
		System.out.println(str); //print the result
	}
}
