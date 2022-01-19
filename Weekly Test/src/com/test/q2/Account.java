package com.test.q2;

abstract public class Account {
	private final Owner owner;
	private float bal;
	private String number;
	
	public Account() {
		owner = new Owner();
	}
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.bal = balance;
		this.number = number;
	}
	public Account(Account a) {
		this.owner = a.owner;
		this.bal = a.bal;
		this.number = a.number;
	}
	public void deposit(double sum) {
		System.out.println("Depositing : "+sum);
		bal +=sum;
		System.out.println("Updated Balance: "+bal);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Owner getOwner() {
		return owner;
	}
	public float getBal() {
		return this.bal;
	}
	public void setBal(float balance) {
		this.bal = balance;
	}
	public void withdraw(double sum) {
		System.out.println("Withdrawing : "+sum);
		bal -= sum;
		System.out.println("Updated Balance: "+bal);
	}
	abstract public float getBalance();
}
