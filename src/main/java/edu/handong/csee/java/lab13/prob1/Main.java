package edu.handong.csee.java.lab13.prob1;  //package name

public class Main {  //Main class

	public static void main(String[] args) { //main method to start this program

		Friend friend1 = new Friend("Jeong hoon Jo"); //Create Friend instance
		Friend friend2 = new SchoolFriend("Jin su Jo"); //Create SchoolFriend instance
		Friend friend3 = new ClassFriend("Na kyung Lee"); //Create ClassFriend instance

		//we don't need to instantiate the InstanceOf class, because whatFriend() is static method. 
		InstanceOf.whatFriend(friend1); //call whatFriend method with friend1, which is Friend
		InstanceOf.whatFriend(friend2); //call whatFriend method with friend2, which is SchoolFriend
		InstanceOf.whatFriend(friend3); //call whatFriend method with friend3, which is ClassFriend

	}		
}
