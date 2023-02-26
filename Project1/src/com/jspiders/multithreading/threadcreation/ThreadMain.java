package com.jspiders.multithreading.threadcreation;

public class ThreadMain {
public static void main(String[] args) {
	Thread1 obj = new Thread1();
	obj.start();
	
	Thread2 obj2 = new Thread2();
	Thread obj3 = new Thread(obj2);
	obj3.start();
}
}
