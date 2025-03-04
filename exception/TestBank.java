package com.exception;

public class TestBank {
/**
 * in this class sir set the Balance after catch block and sout the getBalance
 * then ask what is the output
 * you just write the exception message and getBalance() print balance you set after catch block
 * because its override the setBalance()
 */
public static void main(String[] args) {
	BankAccount ba = new BankAccount();
	ba.setBalance(100);
	ba.deposit(100);
	try {
		System.out.println(ba.withdraw(201));
	}catch(BankExceptionn e){
		System.out.println(e);
	}
	// this code is not part of program but if sir make changes so you remember it
	//ba.setBalance(100);
	//System.out.println(ba.getBalance()+"OK");
}
}
