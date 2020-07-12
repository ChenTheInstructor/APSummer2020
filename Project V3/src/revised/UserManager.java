package revised;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
	public static void add(UserBag userBag, User user) {
		userBag.insert(user);
	}

	public static void create(UserBag userBag) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a new user name, password, and full name: ");
		String newUserInfo = scan.nextLine();
		String[] userTokens = newUserInfo.split(" ");
		User newUser = new User(userTokens[0], userTokens[1], userTokens[2]);
		userBag.insert(newUser);

	}
	
	public static boolean isLoggedIn(UserBag userBag, String userName, String password) {
		User userFound = null;
		boolean isLoggedInFlag = false;
		userFound = userBag.findByUserName(userName);
		if(userFound!=null) {
			if(password.equals(userFound.getPassword())) {
				isLoggedInFlag= true;
			} 
		}
		return isLoggedInFlag;
	}
	
	public static void display(UserBag userBag, String userName, String password) {
		User userFound = userBag.findByUserName(userName);
		
		if(isLoggedIn(userBag, userName, password)) {
			System.out.println("Login Success! Hi " + userFound.getName() + "!");
		} else {
			System.out.println("Incorrect username or password");
		}

	}

	public static void createUsers(UserBag userBag, int numberOfUsers) {
		for(int i = 0; i < numberOfUsers; i++) {
			create(userBag);
		}
	}

	public static void fillTheBag(UserBag userBag, int numberOfUsers) {
		Random random = new Random();
		for(int i = 0; i < numberOfUsers; i++) {
			int randomNumber1 = random.nextInt(10);
			int randomNumber2 = random.nextInt(10);
			String userName = "u" + randomNumber1;
			String password = "p" + randomNumber2;
			String name = "up" + (randomNumber1 + randomNumber2);
			User newUser = new User(userName,  password, name);
			userBag.insert(newUser);
		}
		
	}

}
