package javaprograms;

public class Positive_or_negative {
	
	public static String positive(int a)
	{
		String str;
		
		if(a>0)
		{
			str="a is positive";
		}
		else
		{
			str="a is negative";
		}
	return str;

	}

	public static void main(String[] args) {
		
		System.out.println(positive(10));
	}

}
