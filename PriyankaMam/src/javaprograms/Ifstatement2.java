package javaprograms;
import java.util.Scanner;

public class Ifstatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int a = sc.nextInt();
		System.out.println("enter the no");
		int b= sc.nextInt();
		System.out.println("enter the no");
		int c= sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("a is greatest");
		
		}
		else if(b>c)
		{
		System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is graetest");
		}
		
	}

}
