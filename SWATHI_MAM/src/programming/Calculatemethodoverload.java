package programming;
import java.util.Scanner;

public class Calc{//method overloading example
	
	public static void calculate(int, char) {
		
	}
	
	public static void calculate(int, int, char) {
		
	}
	
	
	
public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the input for method 1");
	    int a=sc.nextInt();
	    char ch=sc.next().charAt(0);
		calculate(a,ch);
	
}
}
