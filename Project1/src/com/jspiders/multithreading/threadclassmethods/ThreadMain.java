package com.jspiders.multithreading.threadclassmethods;

public class ThreadMain {
public static void main(String[] args) {
	MyThread1 obj = new MyThread1();
//	Thread obj2 = new Thread(obj);
	obj.start();
}
}
