package programming;
import java.util.Scanner;

public class TestingCode3 {

{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter your choice\n Enter 's' for perimeter of square'\n'r' for perimeterof rectangle\n 'c' for perimeter of circle'");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
			case 's' :
			{
				System.out.println("Enter the side");
				double side=sc.nextDouble();
				perimeter(side);
			}
			break;
			case 'r' :
			{
				System.out.println("Enter length and also breadth");
				int length=sc.nextInt();
				int breadth=sc.nextInt();
		     perimeter(length,breadth);
			}
			break;
			case 'c' :
			{
				System.out.println("Enter the radius");
				double radius=sc.nextDouble();
				perimeter(radius);
			}
			break;
			default : System.out.println("invalid choice");
       


		}
	}
	public static void perimeter(double side)
	{
		double p=4*side;
		System.out.println("perimeter of square"+p);
	}
	public static void perimeter(int length, int breadth)
	{
		int p=length*breadth;
		System.out.println("perimeter of rectangle"+p);
	}
	public static void perimeter(double radius)
	{
		double p=2*3.14*radius;
		System.out.println("perimeter of circle"+p);
	}
}
}
