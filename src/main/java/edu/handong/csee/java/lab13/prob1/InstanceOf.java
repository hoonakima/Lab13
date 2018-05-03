package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {

	static public void whatFriend(Friend friend) {

		if(friend instanceof SchoolFriend) {
			SchoolFriend mySchoolFriend = (SchoolFriend)friend;
			mySchoolFriend.whatFriend();
		}

		else if (friend instanceof ClassFriend) {
			ClassFriend myClassFriend = (ClassFriend)friend;
			myClassFriend.whatFriend();
		}

		else
			friend.whatFriend();

	}

}
