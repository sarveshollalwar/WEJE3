import java.util.Scanner;
class Factorial4
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter your number");
int n= s.nextInt();
Factorial4 ob = new Factorial4();
int result = ob.fact(n);
System.out.println("factorial of thr given number is"+result);
}
int fact(int n)
{
  if(n==1)
  {
    return 1;
  }
  else
  {
    return n*fact(n-1);
  }
}
}