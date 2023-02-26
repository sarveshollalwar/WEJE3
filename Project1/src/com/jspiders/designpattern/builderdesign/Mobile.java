package com.jspiders.designpattern.builderdesign;

public class Mobile {

	String brand;
	String model;
	double price;
	String color;
	int front_cam;
	int rear_cam;
	int ram;
	int memory;
	double processor;
	String os;
	
	

	public Mobile(String brand, String model, double price, String color, int front_cam, int rear_cam, int ram,
			int memory, double processor, String os) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.front_cam = front_cam;
		this.rear_cam = rear_cam;
		this.ram = ram;
		this.memory = memory;
		this.processor = processor;
		this.os = os;
	}



	@Override
	public String toString() {

		return "Brand= "+brand+
				"\nModel= "+model+
				"\nPrice= "+price+
				"\nColor= "+color+
				"\nFront cam= "+front_cam+
				"\nRear cam= "+rear_cam+
				"\nRam= "+ram+
				"\nMemory= "+memory+
				"\nProcessor= "+processor+
				"\nOs= "+os;
				
	}

}
