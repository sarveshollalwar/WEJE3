package programming;

public class Method2 {
public static void main(String[] args) {
	//System.out.println(test(12));
	System.out.println(test2(4,17));
}
//public static int test(int n)//n=12|
//{
//	int x;
//	for(x=1; x<=n; x++)//x=1|
//	{
//		if(n%x==0)
//		{   
//			//break;
//			continue;
//		
//		}
//			
//	}
//	return x;
//}
public static int test2(int a, int b)
{
	while(a==b)
	{
		if(a>b)
			a=a-b;
		else
			a=b-a;
	}
	return a;
}
}

