package javapro;

public class P8 {
	int a =10;
    public void test()
    {
    	System.out.println("test()");
    }
-------------------------------------------------------
    static void check()
    {
    	P8 obj2 = new P8();
    	System.out.println(obj2.a);
    	obj2.test();
    }
//    static {
//    	P8 obj = new P8();
//    	System.out.println(obj.a);
//    	obj.test();
//    }
    public void check2()
    {
    	P8 obj = new P8();
    	System.out.println(obj.a);
    	obj.test();
    }
//    {
//    	P8 obj = new P8();
//    	System.out.println(obj.a);
//    	obj.test();
//    }
    P8()
    {
    	System.out.println(a);
    	test();
    }
    P8(int n)
    {
    	System.out.println(a);
    	test();
    }
public static void main(String[] args) {
	P8 obj = new P8();
	obj.check2();
	
}
}
