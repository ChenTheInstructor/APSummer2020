package p4_split_string;

public class Demo1 {

	public static void main(String[] args) {
		String names = "James, John, Robert, Michael, Zack";
		String[] nameTokens = names.split(",");
		for(int i = 0; i < nameTokens.length; i++) {
			System.out.println(nameTokens[i].trim());
		}
	}

}
