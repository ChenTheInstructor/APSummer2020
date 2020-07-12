package p3;

import java.util.Scanner;

public class Person {
	
	Scanner scan = new Scanner(System.in);
	private String name;
	private String id;
	private String zip;

	private static int idCounter = 0;

	public Person(String name, String zip)  {
		this.name = name;
		if (isZipCorrect(zip)) {
			this.zip = zip;
		} else {
			do {
				try {
					throw new IncorrectZipException("Incorrect zip.");
				} catch (IncorrectZipException e) {
					System.out.println("Enter a new zip: ");
					String zipEntered = scan.nextLine();
					if(isZipCorrect(zipEntered)) {
						this.zip = zipEntered;
						break;
					}
				} 
			} while (true);
		}
		id = String.valueOf(idCounter++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		if (isZipCorrect(zip)) {
			this.zip = zip;
		} else {
			do {
				try {
					throw new IncorrectZipException("Incorrect zip.");
				} catch (IncorrectZipException e) {
					System.out.println("Enter a new zip: ");
					String zipEntered = scan.nextLine();
					if(isZipCorrect(zipEntered)) {
						this.zip = zipEntered;
						break;
					}
				} 
			} while (true);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", zip=" + zip + "]";
	}

	public boolean isZipCorrect(String zip) {
		if(zip.length() != 5) {
			return false;
		} else {
			for(int i = 0; i < 5; i++) {
				if(!Character.isDigit(zip.charAt(i))){
					return false;
				}
			}
			return true;
		}
	}
}
