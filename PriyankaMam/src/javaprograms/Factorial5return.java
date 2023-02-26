package javaprograms;

public class Factorial5return {
	public static int factorial(int n)
	{
	int fact=1;
	for(int i=n; n>=1;n-- )
	 {
	  fact= fact*n;
	 }
	return fact;
	}
public static void main(String[] args) {
	System.out.println(factorial(5));
}
}

