package com.cinco.payroll;

public class SalaryEmployee extends Employee{
	private double annualSalary;
	
	public SalaryEmployee(String id, String lastName, String firstName, String title, double annualSalary) {
		super(id, lastName, firstName, title);
		this.annualSalary=annualSalary;
	}	
	public double getTaxes() {
		return .2 * annualSalary/52;
	}
	public double getNetPay() {
		return (annualSalary-(annualSalary*.2))/52 + 100;
	}
	public double getGrossPay(){
		return annualSalary/52;
	}	
	public String getType() {
		return "Salary";
	}
}