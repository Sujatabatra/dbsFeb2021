
//Modularization : Breaking long programs in small modules 
public class MyModularDemo {

	//Data
	static int number,factorial;
	
	//method is for taking input
	static void inputNumber(int no){
		number=no;
	}
	//method for calculating factorial
	static void calculateFactorial(){
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	//method for displaying factorial
	static void displayFactorial(){
		System.out.println("Factorial = "+factorial);
	}
	
	//method for calling rest of the methods
	public static void main(String args[]){
		inputNumber(5);
		//logical error
		//number=number*0;
		calculateFactorial();
		factorial=9;
		displayFactorial();
	}
}
