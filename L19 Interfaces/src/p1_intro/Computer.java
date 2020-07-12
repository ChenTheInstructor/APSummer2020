package p1_intro;

public class Computer implements ComputerIF {

	@Override
	public double compute(double number1, double number2) {
		return number1 + number2;
	}

}
