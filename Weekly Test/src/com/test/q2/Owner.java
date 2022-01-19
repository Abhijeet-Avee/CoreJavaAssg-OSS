package com.test.q2;

public class Owner {
	private String name;
	private String nic;
	private final Date dateOfBirth;
	public Owner() {
		dateOfBirth = new Date();
	}
	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.nic = nic;
		this.dateOfBirth = dateOfBirth;
	}
	public Owner(Owner owner) {
		this.name = owner.name;
		this.nic = owner.nic;
		this.dateOfBirth = owner.dateOfBirth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner Name=").append(name).append("\nnic=").append(nic).append("\ndateOfBirth=")
				.append(dateOfBirth);
		return builder.toString();
	}
		
}
