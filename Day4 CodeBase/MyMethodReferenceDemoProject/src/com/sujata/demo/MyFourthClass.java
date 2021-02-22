package com.sujata.demo;

//4. to call constructor
class Person{
	private int pId;
	private String pName;
	
	public Person(){
		
	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
}

@FunctionalInterface
interface PersonFactory{
	Person getInstance(int id,String name);
}

public class MyFourthClass {

	public static void main(String[] args) {
		
//		PersonFactory personFactory=(id,name)-> new Person(id,name);
		
		PersonFactory personFactory=Person::new;
		
		Person p=personFactory.getInstance(101, "AAAAA");
		System.out.println(p);

	}

}
