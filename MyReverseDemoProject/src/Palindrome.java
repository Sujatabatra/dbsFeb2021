
public class Palindrome {

	private int number;
	private boolean status;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isStatus() {
		Reverse rOb=new Reverse();
		rOb.setNumber(number);
		
		if(number==rOb.getRevNum())
			status=true;
		else
			status=false;
		return status;
	}
	
	
}
