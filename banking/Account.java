package com.banking;

public class Account {
	
	private long accountNumber;
	private int balance;
	private String accountType;
	private  Customer customer;

	public Account(long accountNumber, int balance, String accountType, Customer customer) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.customer = customer;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void depositAmmount(int amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Amount deposited successfully");
		}
		else
			System.out.println("please enter the positive number to deposit");
	}

	public void withDrawAmount(int amount) {
		if(amount>0&&balance-amount>0) {
			balance=balance-amount;
			System.out.println("The amount "+amount+" withDraw Successfully ");
		}
		else
			System.out.println("please check amount  you have less balance");
	}

	public void checkbalance() {
		System.out.println("Your account balance is = "+balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType
				+ ", customer=" + customer + "]";
	}

}
