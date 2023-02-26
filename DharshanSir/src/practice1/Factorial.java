package practice1;

public class Factorial {
	static int fact=1;
	public static int fact(int n)
	{
		
		if(n>=1)
		{
			fact=fact*n;
			fact(n-1);
		}
		return fact;
	}
public static void main(String[] args) {
	System.out.println(fact(5));
	
}
}
