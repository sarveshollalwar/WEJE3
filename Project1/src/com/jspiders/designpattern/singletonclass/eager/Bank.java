package com.jspiders.designpattern.singletonclass.eager;

public class Bank {
	private static Bank bank=new Bank();
private Bank()
{
	System.out.println("Constructor accessed");
}
public static Bank getObject()
{
	return bank;
}
}
