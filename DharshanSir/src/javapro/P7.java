package javapro;

public class P7 {
static int a=20;
public static void test()
{
	System.out.println("test()");
}
static {
	System.out.println(a);
	test();
}
public static void test2()
{
	System.out.println(a);
	test();
}public void test3(){
	P7 obj = new P7(10);	System.out.println(obj.a);	obj.test();}
{
	P7 obj = new P7(10);
 System.out.println(obj.a);
	obj.test();
}
P7()
{
	P7 obj = new P7(10);
System.out.println(obj.a);
obj.test();
}
P7(int n)
{
	P7 obj = new P7(10);
	System.out.println(obj.a);
	obj.test();
}
public static void main(String[] args) {
	P7 obj = new P7(10);
	test();
	test2();
	obj.test3();
	
}
}
