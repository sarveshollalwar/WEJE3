package programming;
import java.util.Scanner;

public class Pattern2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("ENTER THE NUMBER OF ROWS ");
//	int in=sc.nextInt();
	for(int i=5; i>=1; i-- )
	{
		//int n=in;
		for(int j=i; j>=1; j--)
		{ 
			if(j!=i)
			{
				System.out.print(" ");
				break;
			}
			else if(j==i)
			{
				System.out.print("*");
			}
			

		}
		System.out.println();
	}
}
}
