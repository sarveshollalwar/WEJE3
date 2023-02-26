package staticmembers;

public class StaticClassRefVerCAll {

	static int a;
//	 Static block 
	static{
		System.out.println("I am static block "+StaticClassRefVerCAll.a);
	      }
//	 Non static block
	{
		System.out.println("I am Non static block "+StaticClassRefVerCAll.a);
	}
//	 Static method
   public static void m1()
   {
   	System.out.println("I am static Method "+StaticClassRefVerCAll.a);
   }
//   Non static method
   public void m2() 
   {
   	System.out.println("I am Non static method "+StaticClassRefVerCAll.a);
   }
//   No arg Constructor
   StaticClassRefVerCAll()
   {
   	System.out.println("I am no arg constructor "+StaticClassRefVerCAll.a);
   }
//   Parametrized Constructor
   StaticClassRefVerCAll(int n)
   {
   	System.out.println("I am parametrized constructor "+StaticClassRefVerCAll.a);
   }
public static void main(String[] args) {
	StaticClassRefVerCAll obj = new StaticClassRefVerCAll();
	m1();
	obj.m2();
}
}
