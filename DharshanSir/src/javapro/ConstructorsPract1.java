package javapro;

public class ConstructorsPract1 {
	int m;
ConstructorsPract1(int n)
{
	m=n;
	
	System.out.println("check3 "+m);
	
}
ConstructorsPract1()
{
	m=500;
	
	System.out.println("check4 "+m);
	
}



public static void main(String[] args) {
	ConstructorsPract1 obj = new ConstructorsPract1(100);
	System.out.println(obj.m);
	obj.m=800;
	
	System.out.println(obj.m);
	
	ConstructorsPract1 obj2 = new ConstructorsPract1(200);
	System.out.println(obj2.m);
	obj2.check();
	System.out.println("check "+obj.m);
	System.out.println("check "+obj2.m);
	obj2.check2();
	ConstructorsPract1 obj3 = new ConstructorsPract1();
	System.out.println(obj3.m);
	
}
public void check()
{
	System.out.println("check "+m);
	this.m=10;
	System.out.println(m);
}
public void check2()
{
	System.out.println("check2 "+m);
}
}
