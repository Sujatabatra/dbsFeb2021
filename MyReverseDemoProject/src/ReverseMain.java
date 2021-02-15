
public class ReverseMain {

	public static void main(String[] args) {
		Reverse rOb=new Reverse();
		rOb.setNumber(1234);
		System.out.println("Reverse No : "+rOb.getRevNum());

		Palindrome pOb=new Palindrome();
		pOb.setNumber(12321);
		if(pOb.isStatus())
			System.out.println("No is palindrome ");
		else
			System.out.println("No is not Palindrome");
	}

}
