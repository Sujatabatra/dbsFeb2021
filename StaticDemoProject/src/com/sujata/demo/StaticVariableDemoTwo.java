package com.sujata.demo;

class DummyStaticTwo{
	
	//instance variable
	int x;
	//class variable : stack at compile time (y variale existence is there irrespective of we have object or not)
	private static int y;
	
	/*static methods can also be called like static variable
	 * Note : from static(class loading) methods we can't access non static members(when objects gets created) 
	 */
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
//		x=10;
		DummyStaticTwo.y = y;
	}
	//Problem : to call inputXY() or showXY() we need objects
	public void inputXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void showXY(){
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	static{
		System.out.println("Hello from Static block");
	}
}
public class StaticVariableDemoTwo {

	public static void main(String[] args) {

		DummyStaticTwo.setY(10);
		System.out.println("y : "+DummyStaticTwo.getY());
		
		
	}

}
