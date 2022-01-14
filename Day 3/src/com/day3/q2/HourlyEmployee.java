package com.day3.q2;

public class HourlyEmployee extends Employee{
	private double hours_worked;

	public HourlyEmployee(int empId, String name, double salary, double rate,double hours) {
		super(empId, name, salary, rate);
		this.hours_worked = hours;
	}
	@Override
	public double getPayment() {
		this.setSalary(this.getRate()*this.hours_worked);
		return this.getSalary();
	}	
}
