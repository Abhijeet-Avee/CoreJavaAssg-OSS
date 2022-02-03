package com.test.q2.model.persistence;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.q2.model.exceptions.CustomerNotFoundException;
import com.test.q2.model.exceptions.DataAccessException;

public class CustomerDaoImpl implements CustomerDao{
private Connection connection;
	
	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
		if(!(tableExists(connection, "customer"))) {
			createTable(connection);
		}
	}
	
	private static boolean tableExists(Connection connection, String tableName) throws DataAccessException{
		DatabaseMetaData meta;
		try {
			meta = connection.getMetaData();
			ResultSet resultSet = meta.getTables(null, null, tableName, new String[] {"TABLE"});
			return resultSet.next();
		} catch (SQLException e) {
			throw new DataAccessException(e);
		}
	}
	
	private static void createTable(Connection connection) throws DataAccessException {
		try {
			Statement statement = connection.createStatement();
			statement.execute("create table customer(id int primary key auto_increment,"
					+ " name varchar(50) not null, address varchar(50) not null,phone varchar(10),"
					+ " dob Date);");
			System.out.println("Table created!!");
		}catch(SQLException e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws DataAccessException {
		List<Customer> customers = new ArrayList<>();
		try {
			Customer customer = null;
			PreparedStatement statement = connection.prepareStatement("select * from book");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				customer = new Customer(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getDate(5));
				customers.add(customer);
			}
		}catch(SQLException e) {
			throw new DataAccessException(e);
		}
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) throws CustomerNotFoundException,DataAccessException {
		Customer customer = null;
		try {
			PreparedStatement statement = connection.prepareStatement("select * from customer where id=?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				customer = new Customer(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getDate(5));
			} else {
				throw new CustomerNotFoundException("employee with id =" + id + " is not found");
			}
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) throws DataAccessException{
		try {
			PreparedStatement insertData = connection
					.prepareStatement("insert into customer(" + 
			"name,address,phone,dob) values (?,?,?,?)");
			insertData.setString(1, customer.getName());
			insertData.setString(2, customer.getAddress());
			insertData.setString(3, customer.getPhone());
			insertData.setDate(4, customer.getDate());
			insertData.executeUpdate();
			System.out.println("Record added !!");
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}
	}

	@Override
	public void updateCustomer(Customer customer) throws DataAccessException{
		try {
			PreparedStatement updateData = connection.prepareStatement("update book set name=?, address=?, phone=?, dob=? where id=?");
			updateData.setString(1, customer.getName());
			updateData.setString(2, customer.getAddress());
			updateData.setString(3, customer.getPhone());
			updateData.setDate(4, customer.getDate());
			updateData.setInt(5, customer.getId());
			updateData.executeUpdate();
			System.out.println("Details Updated !!");
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}
	}

	@Override
	public void removeCustomer(int id) throws DataAccessException{
		try {
			PreparedStatement deleteData = connection.prepareStatement("delete from customer where id=?");
			deleteData.setInt(1, id);
			deleteData.executeUpdate();
			System.out.println("Record removed !!");
		} catch (SQLException ex) {
			throw new DataAccessException(ex);
		}	
	}
}
