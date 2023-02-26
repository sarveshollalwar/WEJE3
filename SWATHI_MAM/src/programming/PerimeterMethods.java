package programming;
import java.util.Scanner;


public class PerimeterMethods {
	public static void main(String[] args) {


		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Input Square or Rectangle Or Circle");
		char input=sc.next().charAt(0);

		switch(input)
		{
		case 's': System.out.println("Enter the side");
		        int side=sc.nextInt();
                perimeter(side);
		        break;
		case 'r': System.out.println("Enter the length and breadth");
		        int length=sc.nextInt();
		        int breadth=sc.nextInt();
                perimeter(length,breadth);
		        break;
		case 'c': System.out.println("Enter the radius");
		        float radius=sc.nextFloat();
                perimeter(radius);
		        break;
		}
	}
	public static void perimeter(int side)
	{

		System.out.println("the perimeter of square is:"+4*side);
	}
	public static void perimeter(int length, int breadth)
	{

		System.out.println("the perimeter of rectangle is:"+(2*(length+breadth)));
	}
	public static void perimeter(float radius)
	{

		System.out.println("the perimeter of circle is:"+2*3.14*radius);
	}
}
