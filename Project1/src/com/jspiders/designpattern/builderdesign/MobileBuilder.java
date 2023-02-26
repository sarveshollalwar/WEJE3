package com.jspiders.designpattern.builderdesign;

public class MobileBuilder {

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
	
	public MobileBuilder Brand(String brand) {
		this.brand = brand;
		return this;
	}
	public MobileBuilder Model(String model) {
		this.model = model;
		return this;
	}
	public MobileBuilder Price(double price) {
		this.price = price;
		return this;
	}
	public MobileBuilder Color(String color) {
		this.color = color;
		return this;
	}
	public MobileBuilder Front_cam(int front_cam) {
		this.front_cam = front_cam;
		return this;
	}
	public MobileBuilder Rear_cam(int rear_cam) {
		this.rear_cam = rear_cam;
		return this;
	}
	public MobileBuilder Ram(int ram) {
		this.ram = ram;
		return this;
	}
	public MobileBuilder Memory(int memory) {
		this.memory = memory;
		return this;
	}
	public MobileBuilder Processor(double processor) {
		this.processor = processor;
		return this;
	}
	public MobileBuilder os(String os) {
		this.os = os;
		return this;
	}
	
	public Mobile getMobile()
	{
		Mobile mobile = new Mobile(this.brand,this.model,this.price,this.color,
				                    this.front_cam,this.rear_cam,this.ram,this.memory,
				                    this.processor,this.os);    
		return mobile;
		
	}
	
}
