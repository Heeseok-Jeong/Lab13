package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner; //import a package to use Scanner

public class Master { //the class Master
	public void feed(Pet pet) { //this method has parameter Pet type
		System.out.println("feed : " + pet.food()); //print about pet's food
	}
	
	public static void main(String[] args) { //the main method
		String catName, dogName; //local variables
		
		Master master = new Master(); //instantiate this class
		Cat cat = new Cat(); //instantiate Cat class
		Dog dog = new Dog(); //instantiate Dog class
		
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		System.out.print("Enter the cat name and dog name : "); //print some message to get names
		catName = keyboard.next(); //catName gets from user
		dogName = keyboard.next(); //dogName gets from user
		
		cat.setName(catName); //set cat's name
		cat.getName(); //print cat's name
		master.feed(cat); //print cat's food 
	
		dog.setName(dogName); //set dog's name
		dog.getName(); //print dog's name
		master.feed(dog); //print dog's food
	}

}
