package javaprograms;

public class Maximumof3number_return {
	
	public static String maximum(int a, int b, int c)
	{
		int n;
		if(a>b&&a>c)
		{
			
			n=a;
		}
		else if(b>c)
		{
			
		    n=b;
		}
		else
		{
			
			n=c;
		}
	 return n+" is greater";
	}
	

	public static void main(String[] args) 
	{
		
          System.out.println(maximum(10,20,30));

	}

}
