package com.cinco.payroll;

public class Staff extends HourlyEmployee{
	private double taxRate;
	
	public Staff(String id, String lastName, String firstName, String title, double hourlyPayRate, double taxRate) {
		super(id, lastName, firstName, title, hourlyPayRate,taxRate);
		this.taxRate=taxRate;
	}
	public double getTaxes() {
		return .15* getGrossPay();
	}
	public String getType() {
		return "Staff";
	}
	

}