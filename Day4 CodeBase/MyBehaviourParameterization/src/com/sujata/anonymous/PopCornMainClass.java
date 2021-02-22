package com.sujata.anonymous;

//class PopCorn{
//
//	void pop(){
//		System.out.println("PopCorn is Popping");
//	}
//}

interface PopCorn{
	void pop();
}
class ButterPopCorn implements PopCorn{
	public void pop(){
		System.out.println("Yummilicious Butter PopCorn is Popping");
	}
}


public class PopCornMainClass {

	public static void main(String[] args) {
//		PopCorn p1=new PopCorn();
//		p1.pop();
		
		PopCorn p1;
		PopCorn p2=new ButterPopCorn();
		p2.pop();
		/* Anonymous Inner class is the way of giving implementation of base class(concrete class, abstract class, interface) methods without giving any derived class name,
		 *  if we want to use that functionality once and we don't need to refer that functionality again in future 
		 *  so no point in increasing the .class overhead
		
		*/
//		p1=new PopCorn(){
//			public void pop(){
//				System.out.println("Hot Caramel PopCorn is Popping");
//			}
//		};
//		
		p1=()-> System.out.println("Hot Caramel PopCorn is Popping");
			
		
		p1.pop();
		
		

	}

}
