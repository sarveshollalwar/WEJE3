package com.jspiders.designpattern.task1;

public class Withdraw {

	double withdraw_amount;
	
	Withdraw(int withdrawamount)
	{
		withdraw(withdrawamount);
	}
	
	public void withdraw(int withdrawamount)
	{
		Account account=Account.getAccount();
		if(withdrawamount<=account.account_balance)
		{
			account.account_balance = account.account_balance-withdrawamount;
			
		}
	}
}
