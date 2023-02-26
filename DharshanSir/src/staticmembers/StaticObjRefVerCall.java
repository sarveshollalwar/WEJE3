package staticmembers;

public class StaticObjRefVerCall {
	static int a;
//	 Static block 
	static{
		StaticObjRefVerCall obj = new StaticObjRefVerCall();
		System.out.println("I am static block "+obj.a);
	      }
//	 Non static block
	{
		//StaticObjRefVerCall obj = new StaticObjRefVerCall();
		System.out.println("I am Non static block "+a);
	}
//	 Static method
  public static void m1()
  {
	  StaticObjRefVerCall obj = new StaticObjRefVerCall();
  	System.out.println("I am static Method "+obj.a);
  }
//  Non static method
  public void m2() 
  {
	  StaticObjRefVerCall obj = new StaticObjRefVerCall();
  	System.out.println("I am Non static method "+obj.a);
  }
//  No arg Constructor
  StaticObjRefVerCall()
  {
	  StaticObjRefVerCall obj = new StaticObjRefVerCall(10);
  	System.out.println("I am no arg constructor "+obj.a);
  }
  StaticObjRefVerCall(String n)
  {
	  
  }
//  Parametrized Constructor
  StaticObjRefVerCall(int n)
  {
	  StaticObjRefVerCall obj = new StaticObjRefVerCall("hi");
  	System.out.println("I am parametrized constructor "+obj.a);
  }
  public static void main(String[] args) {
	  StaticObjRefVerCall obj = new StaticObjRefVerCall();
	  m1();
	  obj.m2();
	  
}
}
