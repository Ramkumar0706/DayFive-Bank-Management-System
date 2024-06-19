package com.banking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		System.out.println("Enter your Bank Name");

		Bank bank1=new Bank(scan.next());
		System.out.println(bank1.getBankName()+" Bank has been created");

		System.out.println("Enter your Bank Name");
		Bank bank2=new Bank(scan.next());
		System.out.println(bank2.getBankName()+" Bank has been created");

		System.out.println("Enter your Bank Name");
		Bank bank3=new Bank(scan.next());
		System.out.println(bank3.getBankName()+" Bank has been created");


		System.out.println("Enter here Customer Details");

		System.out.println("Enter the Customer Id");
		int id=scan.nextInt();
		System.out.println("Enter the customer name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter the customer Location");
		String city=scan.next();
		System.out.println("Enter the Customer mobile number");
		long mobileNo=scan.nextLong();
		Customer c1=new Customer(id, name,city, mobileNo);

		//		System.out.println( "the customer Id is "+c1.getCustomerId()+" Name is"+" "+c1.getCustomerName()+
		//				"\naddress is "+" "+c1.getAddress()+" mobile number is "+c1.getMobileNumber());

		System.out.println("Enter the Customer Id");
		int id1=scan.nextInt();
		System.out.println("Enter the customer name");
		scan.nextLine();
		String name1=scan.nextLine();
		System.out.println("Enter the customer Location");
		String city1=scan.next();
		System.out.println("Enter the Customer mobile number");
		long mobileNo1=scan.nextLong();
		Customer c2=new Customer(id1, name1,city1, mobileNo1);

		System.out.println("Enter the Customer Id");
		int id2=scan.nextInt();
		System.out.println("Enter the customer name");
		scan.nextLine();
		String name2=scan.nextLine();
		System.out.println("Enter the customer Location");
		String city2=scan.next();
		System.out.println("Enter the Customer mobile number");
		long mobileNo2=scan.nextLong();
		Customer c3=new Customer(id2, name2,city2, mobileNo2);

		System.out.println("enter the below details to create the Bank Account");
		System.out.println("Enter the Bank Account Number");
		long accNum=scan.nextLong();
		System.out.println("Enter Amount to opening your bank account with minimum balance is 1000");
		int amt=scan.nextInt();
		System.out.println("Enter the BanK details to open CURRENT or SAVING account");
		String accountType=scan.next();
		bank1.createAccount(accNum, amt,accountType, c1);

		System.out.println("enter the below details to create the Bank Account");
		System.out.println("Enter the Bank Account Number");
		long accNum1=scan.nextLong();
		System.out.println("Enter Amount to opening your bank account with minimum balance is 1000");
		int amt1=scan.nextInt();
		System.out.println("Enter the BanK details to open CURRENT or SAVING account");
		String accountType1=scan.next();
		bank1.createAccount(accNum1, amt1,accountType1, c2);

		System.out.println("enter the below details to create the Bank Account");
		System.out.println("Enter the Bank Account Number");
		long accNum2=scan.nextLong();
		System.out.println("Enter Amount to opening your bank account with minimum balance is 1000");
		int amt2=scan.nextInt();
		System.out.println("Enter the BanK details to open CURRENT or SAVING account");
		String accountType2=scan.next();

		bank3.createAccount(accNum2, amt2,accountType2, c2);

		System.out.println("enter the below details to create the Bank Account");
		System.out.println("Enter the Bank Account Number");
		long accNum3=scan.nextLong();
		System.out.println("Enter Amount to opening your bank account with minimum balance is 1000");
		int amt3=scan.nextInt();
		System.out.println("Enter the BanK details to open CURRENT or SAVING account");
		String accountType3=scan.next();
		bank3.createAccount(accNum3, amt3,accountType3, c3);
		//canara.createAccount(2002, 1500, "Savings", c3);

		System.out.println("================================");

		//sbi.findCustomer(101);
		System.out.println("Enter the Customer id to find the Customer");
		System.out.println(""+bank1.findCustomer(scan.nextInt()));


		System.out.println("================");
		bank1.findAllCustomer();


		System.out.println("+++++++++++");
		System.out.println("Enter the account number to find the account");
		Account account = bank1.findAccountByAccountNumber(scan.nextInt());
		System.out.println("Enter the amount you want to deposit in your account");
		account.depositAmmount(1000);
		int balance = account.getBalance();
		System.out.println(balance);

		System.out.println("+++++++++++");
		Account account1 = bank1.findAccountByAccountNumber(scan.nextInt());
		account1.withDrawAmount(300);
		int balance1 = account1.getBalance();
		System.out.println(balance1);

		System.out.println("------------------------");
		System.out.println("Show the account details of Customer "+c1.getCustomerName());
		c1.viewAccountDetails();

		System.out.println("++++++++++++++++++++++++++++");

		System.out.println("showing the all Account details of their "+bank1.getBankName());
		bank1.findAllAccount();

		System.out.println("find the customer by using customer id Enter the customer Id");
		bank1.findCustomer(scan.nextInt());

		System.out.println("Enter your Account number to Close the Account in the Bank");
		Account removeAccount = bank1.findAccountByAccountNumber(scan.nextInt());
		bank1.closeAccount(removeAccount);

		scan.close();
	}

}
