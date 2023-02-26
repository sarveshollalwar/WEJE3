package programming;

public class Extract_Last_and_First_Number {
public static void main(String[] args) {
	int num=1234;
	int lastdigit= num%10;
	int firstdigit = 0;
	
	while(num>0)
	{   
		//this will give first digit after loop complete
		firstdigit=num%10;//1234%10=4|123%10=3|12%10=2|1%10=1
	
		num=num/10;//1234/10=123|123/10=12|12/10= 1
	}
	
	System.out.println("first digit: "+firstdigit+" last digit: "+lastdigit);
}
}
