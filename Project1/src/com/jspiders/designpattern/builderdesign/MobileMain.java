package com.jspiders.designpattern.builderdesign;

public class MobileMain {

	public static void main(String[] args) 
	{
	   Mobile mobile = new MobileBuilder().Brand("Samsung").Model("S23 Ultra").
			           Price(135000).Ram(16).Memory(256).getMobile();
	   System.out.println(mobile);
    }
}
