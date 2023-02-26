package javaprograms;

public class Spy_Number {

public static void main(String[] args) 
    {
		int num=123;
		int lastdigit;
		int sum=0;
		int product=1;
		while(num>0)
		{
			lastdigit=num%10; // mod 10s of any number will give its last digit
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;  // dividing any number with 10 will eliminate last digit
		}
		if(product==sum)
		{
			System.out.println("Its a spy number");
		}
		else
		{
			System.out.println("Its not a spy number");
		}

	}

}


