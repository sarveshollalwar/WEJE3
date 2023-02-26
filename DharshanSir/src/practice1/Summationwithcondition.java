package practice1;

public class Summationwithcondition {
public static void main(String[] args) {
	int a=0;
	int sum =0;
	while(a<=100)
	{
		if(a%4==0&&a%8==0)
		{
			sum=sum+a;
		}
		a++;
	}
	System.out.println(sum);
}
}
