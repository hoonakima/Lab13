package edu.handong.csee.java.lab13.prob1;

public class Main {

	public static void main(String[] args) {

		Friend friend1 = new Friend("Jeong hoon Jo"); //Just Friend
		Friend friend2 = new SchoolFriend("Jin su Jo"); //School Friend
		Friend friend3 = new ClassFriend("Na kyung Lee"); //Class Friend

		//When each class has different method, then we need to cast it to call the right method for each object.
		//That's why we use instanceOf.
		InstanceOf.whatFriend(friend1);
		InstanceOf.whatFriend(friend2);
		InstanceOf.whatFriend(friend3);

	}		
}
