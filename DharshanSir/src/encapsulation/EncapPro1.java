package encapsulation;

public class EncapPro1 {
String A_name;
String A_number;
private double A_balance;
public double getA_balance() {
	return A_balance;
}
public void setA_balance(double a_balance) {
	A_balance = a_balance;
}
public EncapPro1(String a_name, String a_number, double a_balance) {
	this.A_name = a_name;
	this.A_number = a_number;
	this.A_balance = a_balance;
}
public void display()
{
	System.out.println(this.A_name);
	System.out.println(this.A_number);
	System.out.println(this.A_balance);
	
}
public void loan()
{
	System.out.println(this.A_name+" Has applied for a loan");
}

}
