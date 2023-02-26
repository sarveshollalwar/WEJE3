package javapro;

public class P10 {
static int a=10;
int b =20;
static
{
	int c;
	System.out.println( );
}

public static void main(String[] args) {
	P10 obj = new P10();
	System.out.println(obj.b);
	obj.a=40;
	System.out.println(P10.a+"hii");
}
}
