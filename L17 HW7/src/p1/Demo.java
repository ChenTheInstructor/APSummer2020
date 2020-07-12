package p1;

import java.util.Scanner;

public class Demo {
	
	private static final int MAX_BAG_SIZE = 400;

	public static void main(String[] args) {
		// create useBag object
		
		UserBag userBag = new UserBag(MAX_BAG_SIZE);
		
		// ask user for information to create one account
		UserManager.create(userBag);
		
		// check a given set of username and password 
		UserManager.display(userBag, "t1", "z1");
		
	}

}
