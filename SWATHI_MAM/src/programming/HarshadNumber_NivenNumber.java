package programming;

public class HarshadNumber_NivenNumber {
public static void main(String[] args) {
	int num=153;
	int temp=num;
	int lastdigit;
	int sum=0;
	while(num>0)
	{
		lastdigit = num%10;
		sum= sum+lastdigit;
		num=num/10;
		
	}
	if(temp%sum==0)
	{
		System.out.println("it is a niven number");
	}
	else
	{
		System.out.println("it is not a niven number");
	}
}
}
//In mathematics, a harshad number (or Niven number) in a given number base is an integer that is divisible by 
	//the sum of its digits when written in that base.
