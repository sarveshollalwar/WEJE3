package programming;
import java.util.Scanner;

public class Pattern8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ROWS ");
		int in=sc.nextInt();
		for(int i=in; i>=1; i-- )
		{
			int n=in;
			for(int j=i; j>=1; j--)
			{
				
				System.out.print(j);
			   // n--;
			}
			System.out.println();
		}
	}
	}


