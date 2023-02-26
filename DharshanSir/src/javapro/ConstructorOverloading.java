package javapro;

public class ConstructorOverloading {
char n1='f';
static char n='s';
int x= 80;


ConstructorOverloading()
{
	System.out.println(n); //local-->static-->non-Static
	System.out.println(n1);
	n=65;//local-->static-->non static
	System.out.println(n);
	int n=100;
	System.out.println(n);
	//System.out.println(obj.n);
	System.out.println(this.n);
	//System.out.println(ConstructorOverloading.x);
}
public static void dance()
{
	ConstructorOverloading obj = new ConstructorOverloading ();
    int n=60;
	System.out.println(obj.n); //local--> static-->
	obj.n=67;
	System.out.println(obj.n);
}

public static void main(String[] args) {
	ConstructorOverloading obj = new ConstructorOverloading ();
	
	obj.n=68;
	dance();
}
}
