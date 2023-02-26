package com.jspiders.designpattern.task1;

public class CheckBalance {
    Account account;
	CheckBalance()
	{
		checkBalance(Account.getAccount());
	}

	public void checkBalance(Account account) 
	{
		System.out.println("The account balance is: "+account.account_balance);
	}
	
}
