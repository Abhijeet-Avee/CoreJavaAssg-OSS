package com.day2.overriding;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel,int noOfPassenger,int model,String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	
	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public int getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	void display() {
		System.out.println("Make: "+ make);
		System.out.println("Model: "+model);
		System.out.println("Wheels: "+noOfWheel);
		System.out.println("Passenger Capacity: "+noOfPassenger);
	}
}
