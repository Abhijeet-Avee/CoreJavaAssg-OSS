package com.day3.q2;

public class ApplicationClass {
	public static void main(String[] args) {
		Employee emp = new SalariedEmployee(123,"yash",55000,1600);
		Employee emp1 = new HourlyEmployee(321,"Abhi",10000,100,40);
		Employee emp2 = new CommissionedEmployee(111,"Jeet",8000,10,1000);
		
		Invoice invoice = new Invoice("12345","Engine",10,25000);
		
		System.out.println(emp + ",salary: "+emp.getPayment());
		System.out.println(emp1 + ",salary: "+emp1.getPayment());
		System.out.println(emp2 + ",salary: "+emp2.getPayment());
		System.out.println(invoice + ",Cumulative Bill: "+invoice.getPayment());
	}
}
