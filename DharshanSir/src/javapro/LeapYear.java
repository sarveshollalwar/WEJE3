package javapro;

public class LeapYear {
public static void main(String[] args) {
	int a = 1997;
	boolean res= false;
//	if(a%4==0)
//	{
//		res=true;
//		if(a%100==0)
//		{
//			if(a%400==0)
//			{
//				res=true;
//			}
//			else
//			{
//				res=false;
//			}
//		}
//	}
	if(a%400==0 || a%4==0 &&a%100!=0)
	{
		res=true;
	}
	
	if(res==true)
	{
		System.out.println("Its a leap year");
	}
	else
	{
		System.out.println("Its not a leap year");
	}
}
}
