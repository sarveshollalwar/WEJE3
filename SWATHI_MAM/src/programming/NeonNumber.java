package programming;

public class NeonNumber {
public static void main(String[] args) {
	int num=9;
	int sq= num*num;
	int temp = sq;
	int lastdigit;
	int sum=0;
	while(temp>0)
	{
		lastdigit=temp%10;
		sum=sum+lastdigit;
		temp=temp/10;
	}
	if(sum==num)
	{
		System.out.println("Its a neon number");
	}
	else
	{
		System.out.println("Its not a neon number");
	}
	
}
}
//A neon number is a number where the sum of digits of square of 
//the number is equal to the number.
