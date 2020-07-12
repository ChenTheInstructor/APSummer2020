package p1;

public class MenuItemBag {
	private MenuItem[] arr;
	private int nElems;

	public MenuItemBag(int maxSize) {
		arr = new MenuItem[maxSize];
		nElems = 0;
	}

	public MenuItem findByItemNumber(String itemNumber) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i].getItemNumber().contentEquals(itemNumber)) {
				return arr[i];
			}
		}
		return null;

	}

	public MenuItem removeByItemNumber(String itemNumber) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getItemNumber().contentEquals(itemNumber)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			MenuItem temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public void displayMenu() {
		final String MENU_ITEM_FORMAT = "%-10S%10s%10.2f%n";
		for (int i = 0; i < nElems; i++) {
			System.out.printf(MENU_ITEM_FORMAT, arr[i].getItemNumber(), arr[i].getDescription(), arr[i].getPrice());
		}
	}

	public void insert(MenuItem menuItem) {
		arr[nElems++] = menuItem;
	}
}
