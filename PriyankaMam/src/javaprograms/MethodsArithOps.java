package javaprograms;

public class MethodsArithOps {

	public static void two(int a, int b)
	{   int res3=a*b;
	    System.out.println("product of two numbers is "+res3);
		int res2=a-b;
	    System.out.println("substraction of two numbers is "+res2);
		int res=a+b;
		System.out.println("addition of two numbers is "+res);
		int res4=a/b;
		System.out.println("division of two number is "+res4);
	}
	public static void three(int a, int b, int c)
	{   int res3= a-b-c;
	    System.out.println("substraction of three numbers is: "+res3);
		int res2= a*b*c;
		System.out.println("product of three numbers is: "+res2);
		int res=a+b+c;
		System.out.println("addition of three numbers is "+res);
		int res4=a/b/c;
		System.out.println("division of three number is "+res4);
	}
    public static void main(String[] args) 
    {
    	System.out.println("Arithmatic operations on two numbers:");
    	System.out.println();
		two(10,20);
		System.out.println();
		System.out.println("Arithmatic operations on three numbers:");
		System.out.println();
		three(10,20,30);
		
	}
}
