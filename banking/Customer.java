package com.banking;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int customerId;
	private String customerName;
	private String address;
	private long mobileNumber;
	private List<Account> accountList;

	public Customer(int customerId, String customerName, String address, long mobileNumber) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.accountList = new ArrayList<Account>();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void removeAccount(long accountNumber) {
		for(Account a:accountList) {
			if (a.getAccountNumber()==accountNumber) {
				accountList.remove(a);
				return;
			}
		}
		System.out.println("the Customer did't have the account in the bank");
	}

	public void viewAccountDetails() {
		for(Account a:accountList) {
			System.out.println(a);
		}
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", mobileNumber=" + mobileNumber +  "]";
	}







}
