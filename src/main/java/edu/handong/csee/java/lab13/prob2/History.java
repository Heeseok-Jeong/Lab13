package edu.handong.csee.java.lab13.prob2;

public class History extends Book{ //the class History which is subclass of Book class
	private String author; //String type instance variable author
	
	public History(String name, String author) { //constructor which has String type parameters, name and author
		super(name); //name value put into super class's constructor
		this.author = author; //instance variable author's value is parameter author's value
	}
	
	public String useString() { //the method useString returns String type
		return super.useString() + "\n\tAuthor : " + author; //returns id, name and author
	}

	public void show() { //the method show
		System.out.println("<<<History>>>\n\t" + this.useString()); //prints type, id, name and author
	}
}
