package programming;

public class CharPattern7 {
public static void main(String[] args) {
	char ch='A';
	for(int i=1; i<=5; i++)
	{
		
		for(int j=i; j<=5; j++)
		{
			//System.out.print(ch+" ");// un comment this same output will get
			System.out.print((char)(i+64)+" " );
		}
		System.out.println();
		ch++;
		
	}
}
}
