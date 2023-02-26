package com.jspiders.multithreading.threadcreation;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=5; i++) {
		System.out.println("Thread 2 is running");
	}
	}

}
