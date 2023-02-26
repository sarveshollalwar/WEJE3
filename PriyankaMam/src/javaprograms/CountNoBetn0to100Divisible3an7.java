package javaprograms;

public class CountNoBetn0to100Divisible3an7 {
public static void main(String[] args) {
	int n=0;
	int m =100;
	int count= 0;
	while(n<=m) {
		if(n%3==0 && n%7==0)
		{
			System.out.println(n);
			count++;
		}
		n++;
	}
	System.out.println("total count divisible by 3&7 is "+count);
}
}
