package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class P2 {
public static void main(String[] args) {
	HashSet obj = new HashSet();
	HashSet obj2 = new HashSet();
	obj.add("Abhi");
	obj.add(100);
	obj.add('a');
	obj.add(100);
	
	obj2.add("Sarvesh");
	obj2.add(100);
	obj2.add('b');
	System.out.println(obj.size());
	System.out.println(obj.removeAll(obj2));
	System.out.println(obj.contains(100));
//	System.out.println(obj.re);
	System.out.println(obj);
	System.out.println(obj2);
	ArrayList obj3 = new ArrayList();
	obj3.add(1000);
	obj3.add("Abhi");
	obj3.add('f');
	obj3.add(1000);
	obj3.addAll(obj3);
	System.out.println(obj3);
	
	obj3.addAll(obj1);
	System.out.println(obj3);
	
	
	
	
}
}
