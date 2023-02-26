package javaprograms;

public class EvenOdd {
	
	public static boolean even(int a)
	{
		
		boolean res;
		if(a%2==0)
		{
			res=true;
		}
		else
		{
			res=false;
		}
	return res;
	}

	public static void main(String[] args) {
		
		System.out.println(even(10));

	}

}
