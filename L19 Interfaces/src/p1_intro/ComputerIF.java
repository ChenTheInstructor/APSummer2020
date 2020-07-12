package p1_intro;

public interface ComputerIF {
	// no instance variables
	// all variables are static and final
	String DAY1 = "SUNDAY";
	double PI = 3.14;
	
	// all methods are abstract: not implemented
	double compute(double number1, double number2);

}
