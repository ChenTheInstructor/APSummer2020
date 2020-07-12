package p3_hw3;

public class Demo1 {

	public static void main(String[] args) {
		String name = "John";

		int length = name.length();
		String reversedName = "";
		reversedName = reversedName + name.charAt(length - 1);
		reversedName = reversedName + name.charAt(length - 2);
		reversedName += name.charAt(length - 3);
		reversedName += name.charAt(length - 4);
		System.out.println(reversedName);
	}

}
