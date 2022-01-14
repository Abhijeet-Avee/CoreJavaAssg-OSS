package com.day3.q1;

public class HourlyEmployee extends Employee {

	private double hours_worked;

	public HourlyEmployee(int empId, String name, String empType, double rate, double hours) {
		super(empId, name, empType, rate);
		this.hours_worked = hours;
	}
	
	@Override
	public void calSalary() {
		this.setSalary(this.getRate()*this.hours_worked); 
	}
	
	public double increaseSal(double rate){
		setRate(this.getRate()+rate);
		calSalary();
		return this.getSalary();
	}
	
}
