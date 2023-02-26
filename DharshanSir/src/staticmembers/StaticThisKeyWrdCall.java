package staticmembers;

public class StaticThisKeyWrdCall {
	static int a;
//	 Static block 
	static{
		System.out.println("I am static block "+a);
	      }
//	 Non static block
	{
		System.out.println("I am Non static block "+this.a);
	}
//	 Static method
  public static void m1()
  {
  	System.out.println("I am static Method "+a);
  }
//  Non static method
  public void m2() 
  {
  	System.out.println("I am Non static method "+this.a);
  }
//  No arg Constructor
  StaticThisKeyWrdCall()
  {
  	System.out.println("I am no arg constructor "+this.a);
  }
//  Parametrized Constructor
  StaticThisKeyWrdCall(int n)
  {
  	System.out.println("I am parametrized constructor "+this.a);
  }
  public static void main(String[] args) {
	  StaticThisKeyWrdCall obj = new StaticThisKeyWrdCall();
	  m1();
	  obj.m2();
}
}
