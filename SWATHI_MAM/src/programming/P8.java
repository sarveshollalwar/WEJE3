package programming;

public class P8 {
	static int a = 10;
	void test()
	{
		System.out.println("test()");
	}
//	static void m1()
//	{
//		System.out.println(P8.a);
//	}
//	static {
//		P8 obj = new P8();
//		System.out.println(obj.a);
//	}
//	void check()
//	{
//		P8 obj = new P8();
//		System.out.println(P8.a+" bhai i am non static method");
//	}
//
//	{
//		System.out.println(this.a+" I am non static block");
//	}
	P8()
	{
		
		System.out.println(a+" bhai no arg constructur se hu");
	}
	P8(int n)
	{
		System.out.println(obj.a+" bhai parametrized constructr se hu");
	}
	
	
	
public static void main(String[] args) {
	P8 obj = new P8();
	obj.a=20;
//	m1();
//	obj.check();
	
}
}
