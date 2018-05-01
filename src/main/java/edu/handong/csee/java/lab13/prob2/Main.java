package edu.handong.csee.java.lab13.prob2;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Simple Book");
		Science book2 = new Science("Hello Physics!", "Alex Kim");
		History book3 = new History("What is History?", "E.H.Carr");
		History book4 = new History("Java for newbie", "JC Nam");
		
		book1.show();
		book2.show();
		book3.show();
		book4.show();
	}

}
