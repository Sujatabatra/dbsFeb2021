
public class BetterFactorial {

	//Data modifaible : setter
	//Data readbale : getter
	private int number , factorial;

		public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		factorial=1;
		while(number>1)
			factorial*=number--;
		return factorial;
	}

	
}
