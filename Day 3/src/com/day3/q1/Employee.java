package com.day3.q1;

abstract public class Employee implements Payable{
	private int empId;
	private String name;
	private double salary, rate;
	private String empType;
	public Employee(int empId, String name,String empType,double rate) {
		super();
		this.empId = empId;
		this.name = name;
		this.rate = rate;
		this.empType = empType;
	}
	
	public String getEmpType() {
		return empType;
	}

	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}

	public void empDetails() {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ name);
		System.out.println("Salary: "+salary);
	}
}
