package com.jspiders.multithreading.account;

public class AccountMain {

	public static void main(String[] args) {
	Account acc = new Account(10000);
	Husband hub = new Husband(acc);
	Wife wif = new Wife(acc);
	hub.start();
	wif.start();
	
}
}
