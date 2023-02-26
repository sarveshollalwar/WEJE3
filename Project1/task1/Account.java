package com.jspiders.designpattern.task1;

public class Account {
	 double account_balance;
	static Account account = new Account(10000);
    
	private Account(int account_balance)
	{
		this.account_balance=account_balance;
	}
	
	public static Account getAccount()
	{
		return account;
	}
	
}
