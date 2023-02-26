package collectionframework;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("rice");
		obj.add(true);
		obj.add("mango");
		obj.add(3);
//        System.out.println(obj);
		
		ArrayList obj2 = new ArrayList();
		obj2.add("sarvesh");
		obj2.add(true);
		obj2.add("mango");
//		System.out.println(obj2);
		
		for(Object obj_ref : obj)
		{
			System.out.println(obj_ref);
		}
	}
}
