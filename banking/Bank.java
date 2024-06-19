package com.banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private String bankName;
	private List<Customer> customers;
	private List<Account> accounts;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.customers=new ArrayList<Customer>();
		this.accounts=new ArrayList<Account>();
	}

	public String getBankName() {
		return bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public Customer findCustomer(int customerId) {
		for(Customer c: customers) {
			if(c.getCustomerId()==customerId) {
				return c;
			}
		}
		System.out.println("no customer is present in the Bank");
		return null;
	}

	public void findAllCustomer() {
		for(Customer c:customers) {
			System.out.println(c);
		}
	}

	public Account findAccountByAccountNumber(int accountNumber) {
		for(Account acc: accounts) {
			if(acc.getAccountNumber()==accountNumber) {
				return acc;
			}
		}
		return null;
	}

	public void  findAllAccount() {
		for(Account acc:accounts) {
			System.out.println(acc);
		}
	}

	public void createAccount(long accountNumber,int balance,String accountType,Customer customer) {
		for(Account a:accounts) {
			if(a.getAccountNumber()==accountNumber) {
				System.out.println("the Account is already present in the Bank");
				return;
			}
		}
		Account account = new Account(accountNumber, balance, accountType, customer);
		accounts.add(account);
		customers.add(customer);
		customer.getAccountList().add(account);
		System.out.println("Account was created Successfully");
	}

	public void closeAccount(Account account) {
		for(Account a:accounts) {
			if(a.getAccountNumber()==account.getAccountNumber()) {
				accounts.remove(account);
				account.getCustomer().removeAccount(account.getAccountNumber());
				customers.remove(account.getCustomer());
				System.out.println("Account is successfully closed Thank you !");
				return;
			}
		}
		System.out.println("the Account is not present in the Bank");
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", customers=" + customers + ", accounts=" + accounts + "]";
	}

}
