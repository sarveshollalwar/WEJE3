package com.jspiders.designpattern.singletonclass.lazy;

public class Bank {
	private static Bank bank;
private Bank()
{
	System.out.println("constructor accessed");
}
public static Bank getObject()
{
	if (bank==null) 
	{
		bank=new Bank();
		
	}
	return bank;
	
	
}
}
