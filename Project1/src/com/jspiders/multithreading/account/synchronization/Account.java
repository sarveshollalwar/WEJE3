package com.jspiders.multithreading.account.synchronization;

public class Account {
    //ns global var
	double account_balance;
	//parametrized constructor
	Account(double acc_bal)
	{
		this.account_balance=acc_bal;
	}
	
	//ns method to check balance
	public double check_balance()
	{
		return account_balance;
	}
	//ns method to deposit money
	public  void deposit(double amount)
	{
		System.out.println("Rs "+amount+" is being deposited");
		this.account_balance+=amount;
		System.out.println("Current balance: "+ account_balance);
		
	}
	public  void withdraw(double amount)
	{
		System.out.println("Rs "+amount+" is being Withdrawn");
		this.account_balance-=amount;
		System.out.println("Current balance: "+ account_balance);
		
	}
	
}
