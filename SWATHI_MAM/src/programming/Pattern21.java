package programming;

public class Pattern21 {
public static void main(String[] args) {
	int a,b;
	for(a=5; a>=1; a--)
	{
		for(b=1; b<=5; b++)
		{
			if(a==b)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
