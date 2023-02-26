package collectionframework;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("rice");
		obj.add(true);
		obj.add("mango");
		obj.add(3);
        System.out.println(obj);
		
		ArrayList obj2 = new ArrayList();
		obj2.add("sarvesh");
		obj2.add(true);
		obj2.add("mango");
		System.out.println(obj2);
		
		System.out.println(obj.retainAll(obj2));
		System.out.println(obj);
	}
}
