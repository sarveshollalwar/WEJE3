import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
  Scanner s = new Scanner(System.in);
  System.out.println("Enter a number to check palindrome:");
  int no = s.nextInt();
  int rev=0,rem;
  int temp=no;
    while(temp!=0)
     {
       rem=temp%10;
       rev=rev*10+rem;
       temp=temp/10;
     }
   if(rev==no)
   {
     System.out.println("The number is palindrome");
   }
   else
   {
     System.out.println("Not a palindrome");
   }
}
}

