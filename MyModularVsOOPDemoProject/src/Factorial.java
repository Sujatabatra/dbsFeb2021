
//Encapsulation : Class
public class Factorial {

	//Hiding : private access specifier
	private int number, factorial;

	//Abstraction : method
	// method is for taking input
	public void inputNumber(int no) {
		number = no;
	}

	// method for calculating factorial
	public void calculateFactorial() {
		factorial = 1;
		while (number >= 1)
			factorial *= number--;
	}

	// method for displaying factorial
	public void displayFactorial() {
		System.out.println("Factorial = " + factorial);
	}
}
