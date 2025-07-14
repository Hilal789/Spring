package com.nit.bean;

public class Account {

	private int accountNo;
	private double balance;
	private float interestRate;
	Customer c;

	public Account() {

		super();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

//	public Customer getC() {
//		return c;
//	}
//
	public void setC(Customer c) {
		this.c = c;
	}

	public double deposit(double amount) {
		return balance = balance + amount;
	}

	public double withdraw(double amount) {
		if (amount < 0 && amount > balance) {
			return 0.0;
		}
		return balance-amount;

	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + ", interestRate=" + interestRate + ", Customer ="
				+ c + "]";
	}

	
	
	
	
}
