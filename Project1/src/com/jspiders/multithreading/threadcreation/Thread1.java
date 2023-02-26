package com.jspiders.multithreading.threadcreation;

import java.util.Iterator;

public class Thread1 extends Thread {
        
	     @Override
	    public void run() {
	    	// TODO Auto-generated method stub
	    	super.run();
	    	for(int i=1; i<=5; i++) {
	    	System.out.println("Thread 1 is running");
	    }
	     }
}
