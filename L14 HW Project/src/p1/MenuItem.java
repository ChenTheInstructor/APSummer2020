package p1;

public class MenuItem {
	private String itemNumber;
	private String description;
	private double price;
	
	private static int itemCounter=1;
	
	public MenuItem(String description, double price) {
		itemNumber = String.valueOf(itemCounter++);
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	@Override
	public String toString() {
		return "MenuItem [itemNumber=" + itemNumber + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
