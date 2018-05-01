package edu.handong.csee.java.lab13.prob2;

public class Book { //the class Book
	private static int idCount = 0; //this static variable will count books number
	private String bookName; //String type instance variable protected by private
	private int id; //int type instance variable protected by private
	
	public Book(String name) { //constructor having a one String type parameter
		this.bookName = name; //bookName is name's string value
		idCount++; //plus one idCount
		id = idCount; //id's value is idCount's value
	}
	
	public String useString() { //the method useString returns String value
		return "Id : " + id + "\n\tBook Name : " + bookName; //return id and book name
	}
	
	public void show() { //the method show 
		System.out.println("<<<BOOK>>>\n\t" + this.useString()); //it prints type, id and name
	}
}
