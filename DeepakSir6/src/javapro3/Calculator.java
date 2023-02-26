import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter First Number");
int no1= s.nextInt();
System.out.println("Enter second number");
int no2= s.nextInt();
System.out.println("Select Symbol: +,-,*,/");
String sym= s.next();
int res;
switch(sym)
{
case "+":res=no1+no2;
System.out.println("Addition:"+res);
break;
case "-": res=no1-no2;
System.out.println("Substraction:"+res);
break;
case "*": res=no1*no2;
System.out.println("Multiplication:"+res);
break;
case"/": res=no1/no2;
System.out.println("Division:"+res);
break;
default:System.out.println("invalid input");
break;
}

}
}

