import java.util.Scanner;
class ReverseNumber
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int n = s.nextInt();
int rev=0;
int rem;
while(n!=0)
{
rem= n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.print(rev);
}
}


