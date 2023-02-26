package nonstatic;

import staticmembers.StaticClassRefVerCAll;

public class NonStaticThisKeyWrd {

	 int a;
//	 Static block 
	static{
		NonStaticThisKeyWrd obj = new NonStaticThisKeyWrd();
		System.out.println("I am static block "+obj.a);
	      }
//	 Non static block
	{
		System.out.println("I am Non static block "+this.a);
	}
//	 Static method
 public static void m1()
 {
	 NonStaticThisKeyWrd obj = new NonStaticThisKeyWrd();
 	System.out.println("I am static Method "+obj.a);
 }
// Non static method
 public void m2() 
 {
 	System.out.println("I am Non static method "+this.a);
 }
// No arg Constructor
 NonStaticThisKeyWrd()
 {
 	System.out.println("I am no arg constructor "+this.a);
 }
// Parametrized Constructor
 NonStaticThisKeyWrd(int n)
 {
 	System.out.println("I am parametrized constructor "+this.a);
 }
 public static void main(String[] args) {
	 NonStaticThisKeyWrd obj = new NonStaticThisKeyWrd();
	 m1();
	 obj.m2();
}
}
