import java.util.Scanner;
class Factorial4
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to get its Factorial");
int no = s.nextInt();
int res=1;
for(int i = 2; i<=no; i++)
{
res=res*i;
}
System.out.println("Factorial of " +no+" = "+res);
}
}