package com.jspiders.designpattern.singletonclass.eager;

public class Drvier {

	public static void main(String[] args) {
	Bank obj1 = Bank.getObject();
	Bank obj2 = Bank.getObject();
	Bank obj3 = Bank.getObject();
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj3);
}
}
