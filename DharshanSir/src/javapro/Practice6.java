package javapro;

public class Practice6 {
	int a = 20;

public void test()
{
	System.out.println(a);
	System.out.println(this.a);
//	a=50;
//	System.out.println(a);
//	this.a=80;
//	System.out.println(a);
}
public void test(int n)
{   int a=40;
	System.out.println(a);
}

{
	test(100);
	this.test();
}
Practice6()
{
	test();
	this.test();
}

	public static void main(String[] args) {
    Practice6 obj = new Practice6();
    obj.test();
	}
}
