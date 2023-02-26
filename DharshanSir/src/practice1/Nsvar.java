package practice1;

public class Nsvar {
int a;
public void display()
{
	System.out.println(a);
	a=10;
}
public static void main(String[] args) {
	Nsvar obj = new Nsvar();
	obj.display();
	System.out.println(obj.a);
	Nsvar obj2 = new Nsvar();
	obj2.display();
	System.out.println(obj2.a);
	
}
}
