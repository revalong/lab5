package com.cinco.payroll;

public abstract class HourlyEmployee extends Employee {
	private double hourlyPayRate;
	private double hoursWorked;
	
	public HourlyEmployee(String id, String lastName, String firstName, String title, double hourlyPayRate,
			double hoursWorked) {
		super(id, lastName, firstName, title);
		this.hourlyPayRate=hourlyPayRate;
		this.hoursWorked=hoursWorked;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public double getGrossPay() {
		return getHoursWorked()*getHourlyPayRate();
	}
		
	
	
}