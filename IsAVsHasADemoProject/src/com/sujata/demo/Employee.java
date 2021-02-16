package com.sujata.demo;

//IS-A Relationship
public class Employee extends Person {

	private String department;
	private String designation;
	private String salary;
	public Employee() {
		super();
	}
	public Employee(String pId, String pName, Address pAddress, String department, String designation, String salary) {
		super(pId, pName, pAddress);
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
}
