package practice1;

public class Firstfivenum {
	public static void num(int n)
	{
		if(n<=5)
		{
			
			System.out.println(n);
			num(n+1);
		}
	}
public static void main(String[] args) {
	num(1);
}
}
