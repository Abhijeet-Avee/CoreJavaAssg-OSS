package com.test.q2;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(day).append("/").append(month).append("/").append(year);
		return builder.toString();
	}	
}
