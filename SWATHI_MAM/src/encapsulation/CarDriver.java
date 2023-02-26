package encapsulation;

public class CarDriver {
public static void main(String[] args) {
	Car c1= new Car("Black","300km/hr",11,2500000);
	c1.display();
	c1.setColor("white");
	c1.setMileage(16);
	c1.setPrice(3875999);
	c1.display();
	System.out.println(c1.getE());
	System.out.println(c1.getE().getCc());
	c1.getE().setCc(2500);
	System.out.println(c1.getE().getCc());
	
	
	
}
}
