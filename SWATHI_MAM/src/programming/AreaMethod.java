package programming;
import java.util.Scanner;

public class AreaMethod {
 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter your choice\n Enter 'c forArea of circle'\n's' for area of square\n 'r for area of rectangle'");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
			case 'c' :
			{
				System.out.println("Enter the radius");
				double radius=sc.nextDouble();
				area(radius);
			}
			break;
			case 's' :
			{
				System.out.println("Enter the side");
				int side=sc.nextInt();
				area(side);
			}
			break;
			case 'r' :
			{
				System.out.println("Enter the length and also breadth");
				double length=sc.nextDouble();
				double breadth=sc.nextDouble();
				area(length,breadth);
			}
			break;
			default : System.out.println("invalid choice");
       


		}
	}
	public static void area(double r)
	{
		double ar=3.14*r*r;
		System.out.println("area of circle"+ar);
	}
	public static void area(int s)
	{
		int ar=s*s;
		System.out.println("area of square"+ar);
	}
	public static void area(double l,double b)
	{
		double ar=l*b;
		System.out.println("area of rectangle"+ar);
	}
}