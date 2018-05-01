package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{ //the class Cat which is subclass of Animal class and follows interface Pet
	public String food() { //this method returns String value
		return "(Cat!)" + "Fish"; //returns about cat's food
	}
}
