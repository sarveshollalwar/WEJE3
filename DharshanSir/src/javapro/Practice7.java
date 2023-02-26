package javapro;

public class Practice7 {
	public void test()
	{
		System.out.println("test()");
		test();
	}
	public int test(int n)
	{
		System.out.println(n);
		return n;
	}
	public String test(String str)
	{
		System.out.println(str);
		return str;
	}
public static void main(String[] args) {
	Practice7 obj = new Practice7();
	obj.test();
	obj.test(10);
	obj.test("hello buddy");
	System.out.println(obj.test(40));
	
}
}
