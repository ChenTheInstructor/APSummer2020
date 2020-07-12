package revised;

public class UserBag {
	private User[] arr;
	private int nElems;
	
	public UserBag(int maxSize) {
		arr = new User[maxSize];
		nElems = 0; //which is the default value
	}
	
	public void insert(User user) {
		arr[nElems++] = user;
	}
	
	public User findByUserName(String userName) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getUserName().equalsIgnoreCase(userName)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public User removeByUserName(String userName) {
		int i = 0;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getUserName().equalsIgnoreCase(userName)) {
				break;
			}
		}
		
		if (i==nElems) {
			return null;
		} else {
			User temp = arr[i];
			for(int j = i; j < nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}

}
