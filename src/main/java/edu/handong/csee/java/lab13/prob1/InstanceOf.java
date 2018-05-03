package edu.handong.csee.java.lab13.prob1; //package name

public class InstanceOf { //InstanceOf class
						  //This class is for calling the different named method depending on object.
						  //If each object has same named method, we don't need to use instanceof, because of Dynamic Binding.
	
	static public void whatFriend(Friend friend) { //define whatFriend static method 
												   
		if(friend instanceof ClassFriend) { //check a type of objects is ClassFriend
			((ClassFriend)friend).classFriend(); //type casting to ClassFriend and call classFriend method
		}

		else if(friend instanceof SchoolFriend) { //check a type of objects is SchoolFriend
			((SchoolFriend)friend).schoolFriend(); //type casting to SchoolFriend and call schoolFriend method
		}

		else //when the type of object is Friend
			friend.justFriend(); // call justFriend method in Friend class.

	}

}
