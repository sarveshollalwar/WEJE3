package programming;

public class MethodOverloading {
	
	
//	Method Overloading rules:
//	  1) No of argument different
//    2) sequence of argument different
//    3) datatype of the argument should be different.

	
	public static void main(String[] args)
	{ 
		m1();
		m1(10);
		m1(44.44f);
		m1(10,44.44f);
		m1(44.44f, 10);
		//m1(10,10);The method m1(int, float) is ambiguous for the type MethodOverloading
		
	}
	
public static void m1()
{
	System.out.println("No argument method");
}

public static void m1(int a)
{
	System.out.println(a);
}

public static void m1(float f)
{
	System.out.println(f);
}

public static void m1(int a, float f)
{
	System.out.println(a+" "+f);
}

public static void m1(float f, int a)
{
	System.out.println(f+" "+a);
}


}
