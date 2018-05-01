package edu.handong.csee.java.lab13.prob1;

public class Main { //the class Main

	public static void main(String[] args) { //the main method
		Friend friend1 = new Friend(); //instantiate Friend class
		SchoolFriend friend2 = new SchoolFriend(); //instantiate SchoolFriend
		ClassFriend friend3 = new ClassFriend(); //instantiate ClassFriend
		
		InstanceOf.whatFriend(friend1); //call a method of InstanceOf class
		InstanceOf.whatFriend(friend2); //call a method of InstanceOf class
		InstanceOf.whatFriend(friend3); //call a method of InstanceOf class
	} 

}
