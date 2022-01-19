package com.test.q2;

public class MainClass {
	public static void main(String[] args) {
		Date date = new Date(19,01,2022);
		Owner owner = new Owner("Abhijeet","1234",date);
		Account account = new SavingAccount(owner,10000,"9876543210",6);
		//Account account = new CurrentAccount(owner,10000,"123456789",1000); 
		account.deposit(1200);
		account.getBalance();
		account.withdraw(500);
		account.getBalance();
	}
}
