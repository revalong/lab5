package com.cinco.payroll;

public class Temporary extends HourlyEmployee{
	public Temporary(String id, String lastName, String firstName, String title, double hourlyPayRate, double hoursWorked) {
		super(id, lastName, firstName, title, hourlyPayRate,hoursWorked);
	}
	public double getTaxes() {
		return 0;
	}
	public String getType() {
		return "Temporary";
		
	}
	
	
}