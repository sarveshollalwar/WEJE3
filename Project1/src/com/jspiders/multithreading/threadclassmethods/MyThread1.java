package com.jspiders.multithreading.threadclassmethods;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread name: "+this.getName());
		System.out.println("Priority of thread: "+getPriority());
	}

}
