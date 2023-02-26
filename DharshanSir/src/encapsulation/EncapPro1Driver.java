package encapsulation;

public class EncapPro1Driver {
public static void main(String[] args) {
	EncapPro1 obj = new EncapPro1("Sarvesh","123456",500);
	//System.out.println(obj.A_balance);
	System.out.println(obj.getA_balance());
	obj.display();
	obj.setA_balance(2000);
	System.out.println(obj.getA_balance());
}
}
