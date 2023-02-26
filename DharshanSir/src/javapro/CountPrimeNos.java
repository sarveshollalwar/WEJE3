package javapro;

public class CountPrimeNos {
 public static void main(String[] args) {
	int res = 0;
	int count=0;
	for(int i=0; i<=100; i++)
	{
		
		for(int j = 2; j<=i/2; j++)
		{
			if(i%j==0)
			{
				res=1;
				
				break;
			}
			
		}
		if(res==0)
		{
			System.out.println(i);
			count++;
		}
		else
		{
			res=0;
		}
		
	}
	System.out.println("the count is :"+count);
}
}
