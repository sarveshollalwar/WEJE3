package collectionframework;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("rice");
		obj.add(true);
		obj.add("mango");
		obj.add(3);
		
		System.out.println(obj);
		obj.add(false);
		System.out.println(obj);
		System.out.println(obj.add(true));
		System.out.println(obj);
		
		System.out.println(obj.isEmpty());
		
		System.out.println(obj.contains("mango"));
		
		System.out.println(obj.size());
		
	}
}
