package com.sujata.generics;

public class Employee {

	private int empID;
	private String empName;
	private String designation;
	private String department;
	private int salary;
	
	public Employee(){
		
	}

	public Employee(int empID, String empName, String designation, String department, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
}
