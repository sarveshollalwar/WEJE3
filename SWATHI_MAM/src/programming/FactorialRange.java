package programming;
import java.util.Scanner;
public class FactorialRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE RANGE OF NUMBER");
    int num = sc.nextInt();
    for(int i=1; i<=num; i++)
    {
    	System.out.println(i+"!= "+fact(i)); 
    }
}
  public static int fact(int n)
  {   
	  int fact=1;
	  while(n>0)
	  {
		  fact=fact*n;
		  n--;
	  }
	  return fact;
  }
}

