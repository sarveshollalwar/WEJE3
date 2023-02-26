package javaprograms;

public class Summation10NoReturn {

	public static String summation(int n)
	{
		int sum=0;
		for(int i=n; n>=0; n--)
		{
			sum= sum+i;
		}
		
	return "the sum of nos is: "+sum;

	}
	public static void main(String[] args) {
		System.out.println(summation(10));
	}

}
