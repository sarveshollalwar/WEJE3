package encapsulation;

public class Car {
	private String color;
	private String topspeed;
	private int mileage;
	private double price;

	public Car(String color, String topspeed, int mileage, double price) 
	{
		this.color = color;
		this.topspeed = topspeed;
		this.mileage = mileage;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(String topspeed) {
		this.topspeed = topspeed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//has a---> early instantiation
	private Engine e = new Engine(1999);

	
//getter for engine
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	public void display()
	{
		System.out.println(this.color);
		System.out.println(this.topspeed);
		System.out.println(this.mileage);
		System.out.println(this.price);
	}


}
