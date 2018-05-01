package edu.handong.csee.java.lab13.prob4;

public class Animal { //the class Animal
	private String name; //instance variable name
	
	public void setName(String name) { //this method has String type parameter
		this.name = name; //instance variable name value is parameter value
	}
	
	public void getName() { //the method getName
		System.out.println("Name : " + name); //print name
	}
}
