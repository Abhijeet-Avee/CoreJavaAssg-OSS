package com.day3.q1;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(int empId, String name, String empType, double rate) {
		super(empId, name, empType, rate);
	}

	@Override
	public void calSalary() {
		this.setSalary(this.getRate()*7); 
	}
	
	public double increaseSal(double rate){
		setRate(this.getRate()+rate);
		calSalary();
		return this.getSalary();
	}
	
}
