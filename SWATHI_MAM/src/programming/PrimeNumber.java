package programming;

public class PrimeNumber {
public static void main(String[] args) {
	int num =11;
	boolean b = true;
	
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			b=false;
			break;
		}
	}
	if(!b)
	{
		System.out.println("ITS NOT A PRIME NUMBER");
	}
	else
	{
		System.out.println("IT IS A PRIME NUMBER");
	}
}
}
