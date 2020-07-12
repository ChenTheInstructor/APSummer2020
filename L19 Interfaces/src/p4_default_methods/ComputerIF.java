package p4_default_methods;

// an interface has one unimplemented method is called functional 
// interface
public interface ComputerIF {

	// functional method
	double compute(double number1, double number2);
	
	default double power1(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	static int power2(int n1, int n2) {
		return (int) (Math.pow(n1, n2));
	}


}
