package com.test.q2.model.service;

import java.util.List;

import com.test.q2.model.exceptions.CustomerNotFoundException;
import com.test.q2.model.exceptions.DataAccessException;
import com.test.q2.model.persistence.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers() throws DataAccessException;
	public Customer getCustomerById(int id) throws CustomerNotFoundException,DataAccessException;
	public void addCustomer(Customer customer) throws DataAccessException;
	public void updateCustomer(Customer customer) throws DataAccessException;
	public void removeCustomer(int id) throws DataAccessException;
}
