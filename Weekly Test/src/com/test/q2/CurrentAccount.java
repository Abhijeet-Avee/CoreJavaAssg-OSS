package com.test.q2;

public class CurrentAccount extends Account {
	private float minimumBalance;
	
	public CurrentAccount() {
		super();
		this.minimumBalance = 0;
	}
	public CurrentAccount(CurrentAccount c) {
		super(c);
		this.minimumBalance = c.minimumBalance;
	}
	
	public CurrentAccount(Owner owner, float balance, String number,float minBal) {
		super(owner, balance, number);
		this.minimumBalance = minBal;
	}
	
	public float getCharges() {
		if(getBal()<minimumBalance)
			return 1000;
		else
			return 0;
	}
	
	@Override
	public float getBalance() {
		return getBal()-getCharges();
	}
	
}
