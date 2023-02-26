import java.util.Scanner;
class Factorial5
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number you want factorial of:");
int no = s.nextInt();
Factorial5 ob = new Factorial5();
int result = ob.fact(no);
System.out.println("Factorial of "+no+" is: "+result);
}
int fact(int no)
{
  if(no==1)
  {
    return 1;
  }
  else
  {  
    return no*fact(no-1);
  }
  
}
}


