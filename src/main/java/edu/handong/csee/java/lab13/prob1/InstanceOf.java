package edu.handong.csee.java.lab13.prob1;

public class InstanceOf { //the class InstaceOf
	public static void whatFriend(Friend friend) { //the static method whatFriend has a parameter Friend type friend
		if(friend instanceof ClassFriend) //if friend is subclass of ClassFriend
			((ClassFriend) friend).printClassFriend(); //casts a Friend type friend to ClassFriend and calls it's method
		else if(friend instanceof SchoolFriend) //or friend is subclass of SchoolFriend
			((SchoolFriend) friend).printSchoolFriend(); //casts a Friend type friend to SchoolFriend and calls it's method
		else //or not
			friend.printJustFriend(); //calls Friend class's method
	}
}
