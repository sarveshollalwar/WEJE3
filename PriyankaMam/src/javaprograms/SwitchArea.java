package javaprograms;
import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		
		int r= 20;
		int l= 10;
		int b= 30;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		char ch= sc.next().charAt(0);
	    
	   switch(ch)
	   {
	   case 'a': System.out.println("area of circle is: "+(3.14*r*r));break;
	   case 'b': System.out.println("area of square is: "+(l*l)); break;
	   case 'c': System.out.println("area of rectangle is "+(l*b)); break;
				
	   }

	}

}
