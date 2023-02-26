package encapsulation;

public class SimDriver {
	public static void main(String[] args) {
	
Sim obj = new Sim("Airtel", 9580764896l, 5000);
obj.display();
System.out.println(obj.getBalance());
obj.setBalance(300);
obj.setPhno(9421764896l);
obj.setServiceprovider("Jio");
obj.display();
	}
}