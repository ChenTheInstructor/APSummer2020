package p1;

public abstract class AnimalBehavior {
	private String name;

	public AnimalBehavior(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// impose a required method for every animal!
	public abstract void playTrick();

}
