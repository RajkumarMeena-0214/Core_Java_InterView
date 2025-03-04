package com.exception;

public class BankAccount {
	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance += amt;
		System.out.println("your amt is successfully deposit :"+ amt);
	}

	public double withdraw(double amt) throws BankExceptionn {
		if (balance > amt) {
			balance = balance - amt;
		} else {
			BankExceptionn e = new BankExceptionn("insufficiant fund Avilable balance is :" +balance );
			throw e;
		}
		return balance;
	}
}
