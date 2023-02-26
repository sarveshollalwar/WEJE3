package collectionframework;

import java.util.ArrayList;

public class ArrayList3 {

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
		System.out.println(obj2);
		
//		obj.add(obj2);
		obj.addAll(obj2);
		System.out.println(obj);
		
		
		

	}
}
