package com.day2.overloading;

public class Student {
	private String name,id;
	private double grade;
	
	public Student(String id) {
		this.id = id;		
	}
	public Student(String id, String name) {
		this(id);
		this.name = name;
	}
	public Student(String id, String name, double grade) {
		this(id,name);
		this.grade=grade;		
	}
	
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
	}
	
	public void display(int year) {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Year: "+year);
	}
}
