package programming;

public class PalindromeNumber {
public static void main(String[] args) {
	int lastdigit;
	 int num=121;
	 int temp=num;
	 int rev=0;
	while(num>0)
	{
		lastdigit=num%10;//827%10=7| 82%10=2| 8%10=8|
		rev= rev*10+lastdigit;//0*10+7=7| 7*10+2=72| 72*10+8=728|
		num=num/10;//827/10=82| 82/10=8| 8/10=0.|
	}
	
	if(temp==rev)
	{
		System.out.println("its a palindrome number");
	}
	else
	{
		System.out.println("its not a palindrome number");
	}
}
}
