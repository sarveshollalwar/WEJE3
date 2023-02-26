package javaprograms;

public class CountEvenNos_return {
	
	public static int counteven()
	{
		int count=0;
		for(int i=25; i<=75; i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
			
		}
	  return count;
	}

	public static void main(String[] args) {
		System.out.println(counteven());

	}

}

