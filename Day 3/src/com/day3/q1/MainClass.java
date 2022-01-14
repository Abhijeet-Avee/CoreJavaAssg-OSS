package com.day3.q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	static Scanner in;

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		in = new Scanner(System.in);
		int empId;
		double rate;

		Employee emp1 = new SalariedEmployee(123, "Yash", "salaried", 1000);
		Employee emp2 = new HourlyEmployee(321, "Abhi", "Hourly", 100, 30);
		Employee emp3 = new CommissionedEmployee(456, "Jeet", "Comissioned", 5, 1000);

		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);

		do {
			System.out.println("1. Get salary details");
			System.out.println("2. Set payment rate of employee");
			System.out.println("3. Increase salary");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID: ");
				empId = in.nextInt();
				for (Employee emp : employee) {
					if (empId == emp.getEmpId()) {
						emp.calSalary();
						System.out.println("Salary for EmpID " + empId + ": " + emp.getSalary());
					}
				}
				break;
			case 2:
				System.out.println("Enter Employee ID: ");
				empId = in.nextInt();
				System.out.println("Enter new rate: ");
				rate = in.nextDouble();
				for (Employee emp : employee) {
					if (empId == emp.getEmpId()) {
						emp.setRate(rate);
						System.out.println("Updated rate: " + emp.getRate());
					}
				}
				break;
			case 3:
				System.out.println("Enter Employee ID: ");
				empId = in.nextInt();
				System.out.println("Enter new rate: ");
				rate = in.nextDouble();
				for (Employee emp : employee) {
					if (empId == emp.getEmpId()) {
						emp.increaseSal(rate);
						System.out.println("Updated Salary for EmpID " + empId + ": " + emp.getSalary());
					}
				}
				break;
			case 4:
				System.exit(0);
			}
		} while (true);
	}
}
