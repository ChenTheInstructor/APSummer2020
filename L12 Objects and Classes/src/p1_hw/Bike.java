package p1_hw;

public class Bike {
	private double cost = 1000.0;
	private String color;
	private int speed;

	public Bike() { // initial default values
//		cost = 200.0;
		color = "Black";
		speed = 0;
	}

	public Bike(String color, int speed, double cost) {
		this.cost = cost;
		this.color = color;
		this.speed = speed;
	}
	
	public Bike(Bike bike) {
		this.cost = bike.cost;
		this.color = bike.color;
		this.speed = bike.speed;
	}
	
	public Bike deepCopy(Bike bike) {
		return new Bike(bike);
	}
	
	public Bike deepCopy() {
		return new Bike(this);
	}
	
	public Bike shallowCopy(Bike bike) {
		return bike;
	}
	
	public Bike shallowCopy() {
		return this;
	}

	public double getCost() {
		return cost;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speedUp() {
		speed += 2;
	}

	public void slowDown() {
		speed -= 2;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String getColorAndSpeed() {
		return "Color=" + color + ", Speed=" + speed;
	}

	public void setColorAndCost(String color, double cost) {
		this.color = color;
		this.cost = cost;
	}

	public String toString() {
		return "Bike: Color=" + color + ", Speed=" + speed + ", Price=" + cost;
	}

}
