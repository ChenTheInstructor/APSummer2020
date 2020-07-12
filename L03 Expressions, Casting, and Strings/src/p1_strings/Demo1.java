package p1_strings;

public class Demo1 {

	public static void main(String[] args) {
		String line = "----------------------";
		String name = "   John Doe Doe   ";
		
		int n = name.length();
		System.out.println(n);
		System.out.println(line);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(line);
		System.out.println(name.charAt(0));
		System.out.println(line);
		System.out.println(name.contains("doe"));
		System.out.println(name.toLowerCase().contains("doe"));
		System.out.println(line);
		System.out.println(name.contentEquals("JohnDoe"));
		System.out.println(name.equals("john doe"));
		System.out.println(name.equalsIgnoreCase("john Doe"));
		System.out.println(line);
		System.out.println(name.indexOf("doe"));
		System.out.println(line);
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 7));
		System.out.println(line);
		System.out.println(name.endsWith("e"));
		System.out.println(name.startsWith("J"));
		System.out.println(line);
		System.out.println(name.lastIndexOf("Doe"));
		System.out.println(line);
		System.out.println(name.replace("John", "Joey"));
		System.out.println(line);
		System.out.println(name);
		System.out.println(name.trim());
		System.out.println(line);
		
	}

}
