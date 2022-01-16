package com.day4.q3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,id;
	private String address;
	private transient double salary;		//add transient to make it nonserializable
	public Employee(String name, String id, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
	}
}

public class SerializationDeserialization {
		//SERIALIZATION
		public static void serialize(Employee emp, String filename) {
			try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
				out.writeObject(emp);
				System.out.println("Object has been serialized");
			}catch(IOException ex) {
				ex.getMessage();
			}
		}
		//DESERIALIZATION
		public static void deserialize(String filename) {
			Employee emp = null;
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
				emp = (Employee)in.readObject();
				System.out.println("***Object deserialized***");
				emp.display();
			}catch(IOException | ClassNotFoundException ex) {
				ex.getMessage();
			}
		}
	
		public static void main(String[] args) {
			Employee emp = new Employee("Abhijeet","123","abc",55000.00);
			String filename = "Serialization.ser";
			serialize(emp,filename);
			deserialize(filename);
		}
}
