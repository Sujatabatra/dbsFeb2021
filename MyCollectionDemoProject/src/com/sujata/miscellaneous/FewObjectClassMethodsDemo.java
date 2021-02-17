package com.sujata.miscellaneous;

//POJO : Plain Old Java Object 
class Person {
	private int pId;
	private String pName;

	public Person() {

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
		return "Person is having pId=" + pId + " and  Name=" + pName  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (pId != other.pId)
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}

	
}

public class FewObjectClassMethodsDemo {

	public static void main(String[] args) {
		int x=10;
		System.out.println("x : "+x);
		Person p=new Person(101, "AAAA");
		System.out.println("p : "+p); //implicit call is going to toString() method of object
		
		
		Person p1=new Person(111,"Deepak");
		Person p2=new Person(111,"Deepak");
		
		int i=10;
		int y=10;
		if(i==y)
			System.out.println("i and y are equal ");
		else
			System.out.println("i and y are not equal ");
		
		if(p1==p2)
			System.out.println("p1 and p2 are equal ");
		else
			System.out.println("p1 and p2 are not equal ");
		
		p=p1;

		if(p1==p)
			System.out.println("p1 and p are equal ");
		else
			System.out.println("p1 and p are not equal ");
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are equal ");
		else
			System.out.println("p1 and p2 are not equal");

		

	}

}
