package nonstatic;

import staticmembers.StaticClassRefVerCAll;

public class NonStaticDirectCall {
     int a;
//	 Static block 
//	static{
//		System.out.println("I am static block "+a);
//	      }
//	 Non static block
	{
		System.out.println("I am Non static block "+a);
	}
//	 Static method
// public static void m1()
// {
// 	System.out.println("I am static Method "+a);
// }
// Non static method
 public void m2() 
 {
 	System.out.println("I am Non static method "+a);
 }
// No arg Constructor
 NonStaticDirectCall ()
 {
 	System.out.println("I am no arg constructor "+a);
 }
// Parametrized Constructor
 NonStaticDirectCall (int n)
 {
 	System.out.println("I am parametrized constructor "+a);
 }
 public static void main(String[] args) {
	 NonStaticDirectCall obj = new NonStaticDirectCall();
	// m1();
	 obj.m2();
}
}
