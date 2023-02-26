import java.util.Scanner;
class ReverseANumber
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number to get its reverse:");
int no = s.nextInt();
int rem,rev=0;
while(no!=0)
{ 
   rem=no%10;
   rev=rev*10+rem;
   no=no/10;
}
System.out.println("..............");
System.out.println("Reverse number is: "+rev);
}
}


   