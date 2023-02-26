package inheritance;

public class X_Y_Z_Driver {
public static void main(String[] args) {
	X obj = new X();
	System.out.println(obj.a);
	System.out.println(obj.b);
//	System.out.println(obj.c);
//	System.out.println(obj.d);
	
	Y obj2 = new Y();
	System.out.println(obj2.a);//static of X class ref var
	System.out.println(obj2.b);
	System.out.println(obj2.c);
	System.out.println(obj2.d);
	System.out.println(Y.a);//static of X class class name
	System.out.println(Y.c);//static of Y class
//	System.out.println(Y.b);//cte
//	System.out.println(Y.d);//cte
//	
	Z obj3 = new Z();
	System.out.println();
	System.out.println(obj3.a);//static of X class ref var
	System.out.println(obj3.b);
	System.out.println(obj3.c);
	System.out.println(obj3.d);
	System.out.println(obj3.g);
	System.out.println(obj3.f);
	System.out.println(Z.a);//static of X class name
	System.out.println(Z.c);//static of Y class
	System.out.println(Z.f);//static of Z class
	
}
}
