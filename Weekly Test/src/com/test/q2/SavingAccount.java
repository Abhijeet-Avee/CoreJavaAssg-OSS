package com.test.q2;

public class SavingAccount extends Account {
	private float interestRate;
	
	public SavingAccount() {
		super();
		this.interestRate = 0;
	}

	public SavingAccount(SavingAccount a) {
		super(a);
		this.interestRate = a.interestRate;
	}

	public SavingAccount(Owner owner, float balance, String number,float rate) {
		super(owner, balance, number);
		this.interestRate = rate;
	}
	
	public float getInterest() {
		return (float) (getBal()*interestRate);
	}

	@Override
	public float getBalance() {
		return getBal()+getInterest();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingAccount [interestRate=").append(interestRate).append("]");
		return builder.toString();
	}
	
}
