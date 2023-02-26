import java.util.Scanner;
class Factorial6
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number to get its Factorial");
int n = s.nextInt();
Factorial6 ob = new Factorial6();
int res = ob.Fact(n);
System.out.println(res);
}
int Fact(int n)
{
if(n>=1)
{
return (n*Fact(n-1));
}
else
{
return 1;
}

}

}

 