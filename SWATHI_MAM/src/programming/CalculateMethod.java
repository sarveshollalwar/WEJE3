package programming;
import java.util.Scanner;

public class CalculateMethod {

public static void calculate(int a, char ch) 
{
//		int ld = 0;
//		while(a>0)
//		{
//			ld=a%10;
//			a=a/10;
//		}  bhai ye kam nhi kar raha insted use a%10 in condition directly
		
     if(ch=='s') 
     {
    	 if(a%7==0)
    	 {
    		 System.out.println(a+" is divisible by 7");
    	 }
    	 else
    	 {
    		 System.out.println(a+" is not divisible by 7");
    		 
         }
      }
     else
      {
    	    if(a%10==7)
    	    {
    	    	System.out.println("its lastdigit is 7");
    	    }
    	    else
    	    {
    	    	System.out.println("its lastdigit is not 7");
    	    }
    		 
      }	 
}
	

public static void calculate(int b, int c, char ch2) 
{
	if(ch2=='g')
	{
		System.out.println(b>c?b+"  is greatest": c+"  is greatest");
	}
	else
	{
		System.out.println(b<c?b+"  is smallest": c+"  is smallest");	
	}

}



public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number input for method 1");
		int a=sc.nextInt();
		System.out.println("enter the char for method 1");
		char ch=sc.next().charAt(0);
		calculate(a,ch);
		

		System.out.println("enter the number input for method 2");
		int b=sc.nextInt();
		System.out.println("enter the 2nd number input for method 2");
		int c=sc.nextInt();
		System.out.println("enter the char for method 2");
		char ch2=sc.next().charAt(0);
		calculate(b,c,ch2);

}

}


