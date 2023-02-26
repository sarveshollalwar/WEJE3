package javapro;

public class PrimeNum {
public static void main(String[] args) 
{
	int n = 16;
	boolean res=false;
	for(int i =2; i<=n/2; i++)
	{
	     if(n%i==0)
	     {
	    	 res=true;
	    	 break;
	     }
	}
	if(res==true)
	{
		System.out.println("it is not a prime number");
	}
	else
	{
		System.out.println("it is  a prime number");
	}
}
}
