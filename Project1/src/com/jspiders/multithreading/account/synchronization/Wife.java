package com.jspiders.multithreading.account.synchronization;

public class Wife extends Thread {

	//declare obj ref of account class
		Account acc;
		//constructor
		Wife(Account ac)
		{
			this.acc=ac;
		}
		
		//ns method run
		@Override
		public void run() {
		acc.deposit(1000);
		acc.withdraw(50);
		}
}
