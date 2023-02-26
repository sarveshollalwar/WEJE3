package encapsulation2;

public class MobilePhone {
private String brand;
private int price;
Simcard s1;
Simcard s2;
MobilePhone(String brand, int price)
{
	this.brand=brand;
	this.price=price;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public Simcard getS1() {
	return s1;
}

public void setS1(Simcard s1) {
	this.s1 = s1;
}

public Simcard getS2() {
	return s2;
}

public void setS2(Simcard s2) {
	this.s2 = s2;
}

public void setPrice(int price) {
	this.price = price;
}


public void phoneDetails1()
{
	System.out.println(this.brand);
	System.out.println(this.price);
	s1.simdetails();
	
}
public void phoneDetails2()
{
	System.out.println(this.brand);
	System.out.println(this.price);
	s2.simdetails();
}

}
