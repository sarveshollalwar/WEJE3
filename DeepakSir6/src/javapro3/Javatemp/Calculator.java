import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter first no");
int a = s.nextInt();
System.out.println("Enter second no");
int b = s.nextInt();
System.out.println("Choose symbol:+,-,*,/");
String sym = s.next();
int result;
switch(sym)
{
case "+": result=a+b;
System.out.println("Addition :"+result);
break;
case "-": result=a-b;
System.out.println("Substraction: "+result);
break;
default:
System.out.println("invalid input");
break;
}

}
}