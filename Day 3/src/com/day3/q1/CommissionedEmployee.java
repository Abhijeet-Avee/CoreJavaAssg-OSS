package com.day3.q1;

public class CommissionedEmployee extends Employee {
	private int units_sold;

	public CommissionedEmployee(int empId, String name, String empType, double rate, int units) {
		super(empId, name, empType, rate);
		this.units_sold = units;
	}

	@Override
	public void calSalary() {
		this.setSalary(this.getRate()*units_sold/100); 
	}
	
	public double increaseSal(double rate){
		setRate(this.getRate()+rate);
		calSalary();
		return this.getSalary();
	}
}
