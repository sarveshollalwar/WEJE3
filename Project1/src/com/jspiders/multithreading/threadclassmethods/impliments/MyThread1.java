package com.jspiders.multithreading.threadclassmethods.impliments;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());		
		
	}

}
