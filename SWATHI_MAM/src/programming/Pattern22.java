package programming;

public class Pattern22 {
public static void main(String[] args) {
	int a,b;
	for(a=1; a<=5; a++)
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
