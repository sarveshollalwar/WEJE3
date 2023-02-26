import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number to check prime or not:");
int no = s.nextInt();
int temp = 0;
for(int i= 2; i>=no-1; i++)
{
  if(no%i==0)
  {
    temp=temp=1;
  }
  
}
 if(temp>0)
 {
   System.out.println("The number is not a prime number");
 }
 else
 {
   System.out.println("The number is PRIME number");
 }
}
}
 

  