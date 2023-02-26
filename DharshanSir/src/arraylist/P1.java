package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class P1 {
public static void main(String[] args) {
	ArrayList<Integer> obj = new ArrayList<Integer>();
	obj.add(100);
	obj.add(10);
	obj.add(1000);
//	Collections.sort(obj);
	Collections.reverse(obj);
	for (Object  var :  obj) {
		System.out.println(var);
		
		
	}
	
	
}
}
