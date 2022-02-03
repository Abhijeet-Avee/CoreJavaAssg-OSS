package com.test.q2.web.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import com.test.q2.model.persistence.Customer;
import com.test.q2.model.service.CustomerService;
import com.test.q2.model.service.CustomerServiceImpl;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		/** Add a new customer record */
		System.out.println("Adding book records");
		customerService.addCustomer(new Customer("yash", "raxaul", "1234567890", Date.valueOf("2022-01-29")));
		customerService.addCustomer(new Customer("abhi", "delhi", "9123456701", Date.valueOf("2022-02-09")));
		customerService.addCustomer(new Customer("jeet", "noida", "1234567891", Date.valueOf("2022-02-19")));
		/** Printing all books **/
		printCustomers(customerService);

		/** Updating Book record **/
		System.out.println("Updating customer record");
		customerService.updateCustomer(new Customer("YASH", "Delhi", "1234567890", Date.valueOf("2022-01-29")));
		System.out.println(customerService.getCustomerById(1));

		/** Deleting Book record **/
		System.out.println("Deleting book record");
		customerService.removeCustomer(1);
		printCustomers(customerService);
	}
	
	private static void printCustomers(CustomerService customerService) {
		System.out.println("Printing all customer records");
		List<Customer> customers = new ArrayList<>();
		customers = customerService.getAllCustomers();
		for(Customer customer: customers) {
			System.out.println(customer);
		}
	}
}
