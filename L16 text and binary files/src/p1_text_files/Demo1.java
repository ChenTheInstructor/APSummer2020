package p1_text_files;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String a ="Alan";
		String b = "Zack";
		String c = "Billy";
		String[] names = {a, b, c};
		System.out.println(Arrays.toString(names));
		Arrays.parallelSort(names);
		System.out.println(Arrays.toString(names));
	}

}
