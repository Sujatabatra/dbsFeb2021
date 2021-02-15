
public class Reverse {

	//Data
	//Number : Modifiable , that's why setter
	//revNum : readable , that's why getter
	private int number,revNum;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getRevNum() {
		revNum=0;
		int remainder;
		while(number!=0){
			remainder=number%10;
			revNum=revNum*10+remainder;
			number=number/10;
		}
		return revNum;
	}

}
