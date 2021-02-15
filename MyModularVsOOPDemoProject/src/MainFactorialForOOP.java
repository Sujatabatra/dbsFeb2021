
public class MainFactorialForOOP {

	public static void main(String[] args) {
		Factorial fOb;
		fOb=new Factorial();
		
		fOb.inputNumber(4);
//		fOb.number=0;
		fOb.calculateFactorial();
		fOb.displayFactorial();

		System.out.println("=================");
		BetterFactorial fOb1=new BetterFactorial();
		fOb1.setNumber(5);
		int f=fOb1.getFactorial();
		System.out.println("Our Factorial : "+f);
	}

}
