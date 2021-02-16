package com.sujata.demo;

public class Person {

	private String pId;
	private String pName;
	//Has-A Relationship
	private Address pAddress;
	public Person() {
		super();
	}
	public Person(String pId, String pName, Address pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Address getpAddress() {
		return pAddress;
	}
	public void setpAddress(Address pAddress) {
		this.pAddress = pAddress;
	}
	
}
