package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{ //the class Pet which is subclass of Animal class and follows interface Pet
	public String returnFood() { //this method returns String value
		return "(Dog!)" + "Sausage"; //returns about dog's food
	}
}
