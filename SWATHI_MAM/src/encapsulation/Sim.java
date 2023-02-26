package encapsulation;

public class Sim {
	private String serviceprovider;
	private long phno;
	private double balance;
	
public Sim(String serviceprovider, long phno, double balance) {
		
		this.serviceprovider = serviceprovider;
		this.phno = phno;
		this.balance = balance;
	}

public String getServiceprovider() {
	return serviceprovider;
}

public void setServiceprovider(String serviceprovider) {
	this.serviceprovider = serviceprovider;
}

public long getPhno() {
	return phno;
}

public void setPhno(long phno) {
	this.phno = phno;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}
public void display()
{
	System.out.println(this.serviceprovider);
	System.out.println(this.phno);
	System.out.println(this.balance);
}





}
