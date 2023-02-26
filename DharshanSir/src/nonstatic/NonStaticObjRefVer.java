package nonstatic;

import staticmembers.StaticClassRefVerCAll;

public class NonStaticObjRefVer {
	 int a;
//	 Static block 
	static{
		 NonStaticObjRefVer obj = new NonStaticObjRefVer(44.44);
		System.out.println("I am static block "+obj.a);
	      }
//	 Non static block
	{
		// NonStaticObjRefVer obj = new NonStaticObjRefVer(44.88f);
		//System.out.println("I am Non static block "+obj.a);
	}
//	 Static method
 public static void m1()
 {
	 NonStaticObjRefVer obj = new NonStaticObjRefVer();
 	System.out.println("I am static Method "+obj.a);
 }
// Non static method
 public void m2() 
 {
	// NonStaticObjRefVer obj = new NonStaticObjRefVer();
 	//System.out.println("I am Non static method "+obj.a);
 }
// No arg Constructor
 NonStaticObjRefVer()
 {
	 NonStaticObjRefVer obj = new NonStaticObjRefVer("hii");
 	System.out.println("I am no arg constructor "+obj.a);
 }
// Parametrized Constructor
 NonStaticObjRefVer(int n)
 {
	 NonStaticObjRefVer obj = new NonStaticObjRefVer();
 	System.out.println("I am parametrized constructor "+obj.a);
 }
 //another parametrized constructor
 NonStaticObjRefVer(String n)
 {
 	
 }
 NonStaticObjRefVer(double d)
 {
 	
 }
 NonStaticObjRefVer(float f)
 {
 	
 }
 
 public static void main(String[] args) {
	 NonStaticObjRefVer obj = new NonStaticObjRefVer();
	 m1();
	 obj.m2();
}
}
