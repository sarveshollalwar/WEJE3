package com.jspiders.multithreading.account;

public class Husband extends Thread {
    //declare obj ref of account class
	Account acc;
	//constructor
	Husband(Account ac)
	{
		this.acc=ac;
	}
	
	//ns method run
	@Override
	public void run() {
	acc.deposit(10000);
	acc.withdraw(5000);
	}

	

}
