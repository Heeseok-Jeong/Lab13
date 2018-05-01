package edu.handong.csee.java.lab13.prob2;

public class Main { //the Main class

	public static void main(String[] args) { //the main method
		Book book1 = new Book("Simple Book"); //instantiate Book with one String parameter
		Science book2 = new Science("Hello Physics!", "Alex Kim"); //instantiate Science with two String parameters
		History book3 = new History("What is History?", "E.H.Carr"); //instantiate History with two String parameters
		History book4 = new History("Java for newbie", "JC Nam"); //instantiate History with two String parameters
		
		book1.show(); //show book1's result
		book2.show(); //show book2's result
		book3.show(); //show book3's result
		book4.show(); //show book4's result
	}

}
