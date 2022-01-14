package com.day3.q2;

public class Employee implements Payable{
	private int empId;
	private String name;
	private double salary, rate;
	public Employee(int empId, String name, double salary, double rate) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.rate = rate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public double getPayment() {
		return salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name)
				.append(salary).append(", rate=").append(rate).append("]");
		return builder.toString();
	}
}
