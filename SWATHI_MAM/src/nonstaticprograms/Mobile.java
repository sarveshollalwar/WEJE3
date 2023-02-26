package nonstaticprograms;

public class Mobile {
String brand;
int ram;
int rom;
double price;

public void display(){
	System.out.println(brand);
	System.out.print("Ram: "+ram+"Gb  ");
	System.out.print("Rom: "+rom+"Gb  ");
	System.out.println("Price: "+price+"Rs  ");
	System.out.println();
}

Mobile(String brand,int ram,int rom,double price)
{
	this.brand=brand;
	this.ram=ram;
	this.rom=rom;
	this.price=price;
}
public static void main(String[] args) {
	
}	
}
