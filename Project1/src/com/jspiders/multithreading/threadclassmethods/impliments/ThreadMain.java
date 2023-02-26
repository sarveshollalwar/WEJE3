package com.jspiders.multithreading.threadclassmethods.impliments;

public class ThreadMain {
public static void main(String[] args) {
	MyThread1 obj = new MyThread1();
	Thread obj2 = new Thread(obj);
	obj2.setName("nuovocentro");
	obj2.setPriority(8);
	obj2.start();
	
}
}
