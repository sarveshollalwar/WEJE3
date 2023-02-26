package programming;
import java.util.Scanner;

public class PatternMethods {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your input");
	int input= sc.nextInt();
	switch(input)
	{
	 case 1: pattern(1);
	         break;
	 case 2: pattern(1,1);
             break;
	 case 3: pattern('A');
             break;

	}
}
public static void pattern(int i)
{
	int n=1;
	int j;
	for(i=1; i<=4; i++)
	{
		for(j=1; j<=i; j++)
		{
			System.out.print(n+" ");
			n++;
		}
		System.out.println();
	}
	
}
public static void pattern(int i, int j)
{
	for(i=1; i<=5; i++)
	{
		for(j=1;j<=5;j++)
		{
			if(i==j||i==5||j==1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
}
public static void pattern(char ch)
{
	int i;int j;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
	
}
}
