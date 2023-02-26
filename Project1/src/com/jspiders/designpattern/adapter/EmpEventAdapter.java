package com.jspiders.designpattern.adapter;

public class EmpEventAdapter extends Employee implements Event {

	@Override
	public void childrensDay() {
		EmpEventAdapter obj = new EmpEventAdapter();
		obj.setName("Abhishek");
		obj.setEmpid(12345);
		obj.setDesignation("Founder of the compamy");
		
		System.out.println("Chief Guest of the event is: "+obj.getName()+
				            "\nHis designation is: "+obj.getDesignation()); 
	}
	
	public static void main(String[] args) {
		EmpEventAdapter obj = new EmpEventAdapter();
		obj.childrensDay();
	}
	

}
