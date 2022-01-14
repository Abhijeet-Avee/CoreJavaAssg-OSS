package com.day3.q2;

public class CommissionedEmployee extends Employee{
	private int units_sold;

	public CommissionedEmployee(int empId, String name, double salary, double rate,int units) {
		super(empId, name, salary, rate);
		this.units_sold = units;
	}
	@Override
	public double getPayment() {
		this.setSalary(this.getRate()*units_sold/100);
		return this.getSalary();
	}
}
