package com.cinco.payroll;

public abstract class Employee implements Payable {
	private String id;
	private String lastName;
	private String firstName;
	private String title;
	

	
	public Employee(String id, String lastName, String firstName, String title) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.title = title;
		
	}

	public String getId() {
		return id;
	}


	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getTitle() {
		return title;
	}
	public double getNetPay() {
		return getGrossPay()-getTaxes();
	}
	public abstract double getTaxes();	
	public abstract double getGrossPay();
	public abstract String getType();
	
}