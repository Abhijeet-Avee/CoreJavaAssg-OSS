package com.day3.q2;

public class SalariedEmployee extends Employee{

	public SalariedEmployee(int empId, String name, double salary, double rate) {
		super(empId, name, salary, rate);
	}
	@Override
	public double getPayment() {
		this.setSalary(this.getRate()*7);
		return this.getSalary();
	}
}
