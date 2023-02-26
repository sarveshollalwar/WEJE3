package programming;
import java.util.Scanner;

public class Area2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to switch");
	int input = sc.nextInt();
	
	switch(input)
	{
	case 1: System.out.println("Enter the base and height of parallelogram");
	        int b=sc.nextInt();
	        int h=sc.nextInt();
	        area(b,h); break;
	case 2: System.out.println("Enter thr diagonal rhombus");
	        float d= sc.nextFloat();
		    area(d); break;
	case 3: System.out.println("Enter the top base and bottom base and height of trapezoid ");
	        int g=sc.nextInt();
	        int e=sc.nextInt();
	        int f=sc.nextInt();
	        area(g,e,f); break;
	}
}
public static void area(int b, int h)
{
	
	System.out.println("The area of parallelogram is:"+(b*h) );
}
public static void area(float d)
{
	System.out.println("The area of rhombus is "+(d*d)/2);
}
public static void area(int g, int e, int f)
{
	int res=(g+e)/2*f;
	System.out.println("The area of trapezoid is "+res);
}

}
