package com.greatlearning.model;

public class Employee {
	private String firstName;//since name should be private to the company
	private String lastName; // Similarly
	
	public Employee(String firstName,String lastName){ //crated parametrized method of Employee
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;	
	}

}
