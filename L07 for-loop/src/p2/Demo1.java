package p2;

public class Demo1 {

	public static void main(String[] args) {
		int[][] n = new int[3][4];
		
		n[0][0] = 0;
		n[0][1] = 1;
		n[0][2] = 2;
		n[0][3] = 3;
		
		n[1][0] = 10;
		n[1][1] = 11;
		n[1][2] = 12;
		n[1][3] = 13;
		
		n[2][0] = 20;
		n[2][1] = 21;
//		n[2][2] = 22;
//		n[2][3] = 23;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
