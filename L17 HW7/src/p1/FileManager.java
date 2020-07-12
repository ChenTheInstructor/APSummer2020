package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	public static void fillUserBag(UserBag userBag, String firstNameFile, String lastNameFile, int passwordLength) throws FileNotFoundException {
		String[] fullNameArr = makeFullNames("First Names.txt", "Last Names.txt");
		String[] userNames = makeUserNames(fullNameArr);
		String[] passwords = makePasswords(fullNameArr, passwordLength);
		
		for(int i = 0; i < fullNameArr.length; i++) {
			User user = new User(userNames[i], passwords[i], fullNameArr[i]);
			userBag.insert(user);
		}
	}

	public static String[] makeUserNames(String[] fullNames) {
		String[] userNames = new String[fullNames.length];
		for (int i = 0; i < userNames.length; i++) {
			String[] nameTokens = fullNames[i].split(" ");
			userNames[i] = nameTokens[1] + (nameTokens[0].charAt(0));
		}
		return userNames;
	}

	public static String[] makePasswords(String[] fullNames, int passwordLength) {
		String[] passwords = new String[fullNames.length];
		for (int i = 0; i < passwords.length; i++) {
			passwords[i] = getRandomLetters(passwordLength) + (int) (Math.random() * 10);
		}
		
		return passwords;
	}

	private static String getRandomLetters(int passwordLength) {
		String str = "";
		for (int i = 0; i < passwordLength; i++) {
			str += getRandomLetter();
		}
		return str;
	}

	private static char getRandomLetter() {
		int randomCapLetterInNumber = 65 + (int) (Math.random() * 26);
		int randomLowerCaseInNumber = 97 + (int) (Math.random() * 26);
		if (Math.random() >= 0.5) {
			return (char) randomCapLetterInNumber;
		} else {
			return (char) randomLowerCaseInNumber;
		}
	}

	public static void saveFullNames(String[] fullNames, String fileName) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(fileName);
		for (int i = 0; i < fullNames.length; i++) {
			pw.println(fullNames[i]);
		}
		pw.close();
	}

	public static String[] readNames(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		ArrayList<String> nameList = new ArrayList<>();
		while (scan.hasNextLine()) {
			nameList.add(scan.nextLine());
		}

		String[] nameArr = new String[nameList.size()];
		for (int i = 0; i < nameList.size(); i++) {
			nameArr[i] = nameList.get(i);
		}
		return nameArr;
	}
	

	public static String[] makeFullNames(String firstNameFile, String lastNameFile) throws FileNotFoundException {
		String[] firstNameArray = readNames(firstNameFile);
		String[] lastNameArray = readNames(lastNameFile);
		String[] fullNameArray = new String[200];

		for (int i = 0; i < fullNameArray.length; i++) {
			fullNameArray[i] = extractRandomName(firstNameArray) + " " + extractRandomName(lastNameArray);
		}

		return fullNameArray;
	}

	public static String extractRandomName(String[] names) {
		int randomIndex = (int) (Math.random() * names.length);
		return names[randomIndex];
	}

	public static String extractRandomName(ArrayList<String> nameList) {
		int randomIndex = (int) (Math.random() * nameList.size());
		return nameList.get(randomIndex);
	}
}
