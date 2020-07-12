package p1_while_loop;

class Demo2 {

	public static void main(String[] args) {
//		int count = 0;
//		while (true) {
//			if (count > 4) {
//				break;
//			}
//			System.out.println("John Doe");
//			count++;
//		}
		
		int count = 0;
		
		while(count < 4) {
			System.out.println("John ");
			count++;
			if(count == 2) {
				continue;
			}
			System.out.println("Doe");
		}
	}

}
