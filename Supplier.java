package com.cinco.payroll;

public class Supplier implements Payable{
	private String companyName;
	private double amountDue;
	
	public Supplier(String companyName, double amountDue) {
		super();
		this.companyName = companyName;
		this.amountDue = amountDue;
	}
	public double getNetPay() {
		return amountDue;
	}

}
