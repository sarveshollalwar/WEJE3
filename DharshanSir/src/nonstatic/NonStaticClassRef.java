package nonstatic;

import staticmembers.StaticClassRefVerCAll;

public class NonStaticClassRef {

	 int a;
//	 Static block 
	static{
		//System.out.println("I am static block "+NonStaticClassRef.a);
	      }
//	 Non static block
	{
		System.out.println("I am Non static block "+NonStaticClassRef.a);
	}
//	 Static method
 public static void m1()
 {
 	//System.out.println("I am static Method "+NonStaticClassRef.a);
 }
// Non static method
 public void m2() 
 {
 	System.out.println("I am Non static method "+NonStaticClassRef.a);
 }
// No arg Constructor
 NonStaticClassRef()
 {
 	System.out.println("I am no arg constructor "+NonStaticClassRef.a);
 }
// Parametrized Constructor
 NonStaticClassRef(int n)
 {
 	System.out.println("I am parametrized constructor "+NonStaticClassRef.a);
 }
 public static void main(String[] args) {
	 NonStaticClassRef obj = new NonStaticClassRef();
}
}
