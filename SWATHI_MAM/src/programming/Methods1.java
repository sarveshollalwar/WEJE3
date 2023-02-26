package programming;

public class Methods1 {
public static void main(String[] args) {
	int b=129;//129
	System.out.println(demo(b));
	int c=79;
	System.out.println(demo(c));
}
public static double demo(int a)//a=129int
{
	int b=20;
	if(a<0)//a=129<0 false
	{
		return a;
	}
	else
	{
		return b;//b=20 but retry type is double so 20.0 will be returned
	}
}
}
