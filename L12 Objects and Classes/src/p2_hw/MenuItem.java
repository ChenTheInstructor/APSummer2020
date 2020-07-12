package p2_hw;

public class MenuItem {
	private int itemNumber;
	private String description;
	private int quantity;
	private double price;
	private double subtotal;

	public MenuItem(int itemNumber, String description, double price) {
		super();
		this.itemNumber = itemNumber;
		this.description = description;
		this.price = price;
		this.quantity = 1;
		this.subtotal = quantity * price;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSubtotal() {
		return subtotal;
	}
	
	public void setSubtotal() {
		subtotal = quantity * price;
	}

	@Override
	public String toString() {
		return "MenuItem [itemNumber=" + itemNumber + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + ", subtotal=" + subtotal + "]";
	}

}
