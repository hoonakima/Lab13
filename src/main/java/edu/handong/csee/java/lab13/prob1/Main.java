package edu.handong.csee.java.lab13.prob1;

public class Main {

	public static void main(String[] args) {

		Friend[] friend = new Friend[3];

		friend[0] = new Friend("Jeong hoon Jo"); //Just Friend
		friend[1] = new SchoolFriend("Jin su Jo"); //School Friend
		friend[2] = new ClassFriend("Na kyung Lee"); //Class Friend

		InstanceOf.whatFriend(friend[0]);
		InstanceOf.whatFriend(friend[1]);
		InstanceOf.whatFriend(friend[2]);

	}		
}
