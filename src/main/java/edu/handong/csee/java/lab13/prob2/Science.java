package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{ //the class Science which is subclass of Book class
	private String publisher; //String type instance variable protected by private
	
	public Science(String name, String publisher) { //constructor has two String type parameters
		super(name); //name put into super class's constructor
		this.publisher = publisher; //instance variable publisher's value is parameter publisher's value
	}
	
	public String useString() { //the method useString returns string type value
		return super.useString() + "\n\tPublisher : " + publisher; //it returns id, name and publisher
	}
	
	public void show() { //the show method
		System.out.println("<<<Science>>>\n\t" + this.useString()); //it prints type, id, name and publisher
	}
}
