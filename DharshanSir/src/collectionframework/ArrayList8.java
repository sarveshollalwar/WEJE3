package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(1);
		obj.add(3);
		obj.add(4);
		obj.add(2);
		
		Collections.sort(obj);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		
	}
}
