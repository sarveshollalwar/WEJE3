package javaprograms;
import java.util.Scanner;

public class SwitchAddnSub {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice for calculations \n1)addition\n2)substraction\n3)product\n4)division");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
		System.out.println("enter the first number "); 
		int a=sc.nextInt();
		System.out.println("enter the second number "); 
		int b=sc.nextInt();
		System.out.println("addition is: "+(a+b));
		break;
		case 2:  
		System.out.println("enter the first number "); 
		long c=sc.nextLong();
		System.out.println("enter the second number "); 
		long d=sc.nextLong();
		System.out.println("substraction is: "+(c-d));
		break;
		case 3:  
			System.out.println("enter the first number "); 
			float e=sc.nextFloat();
			System.out.println("enter the second number "); 
			float f=sc.nextFloat();
			System.out.println((e*f));
			break;
		case 4: 
			System.out.println("enter the first number "); 
			double g=sc.nextDouble();
			System.out.println("enter the second number "); 
			double h=sc.nextDouble();
			System.out.println("division is: "+(g/h));
			break;
		default : System.out.println("invalid input");
		}


	}

}
