package com.jspiders.designpattern.task1;

public class Deposit {
	double deposit_amount;
	
	Deposit(int depositamount)
	{
		Account account = Account.getAccount();
		account.account_balance+=depositamount;
	}

	
}
