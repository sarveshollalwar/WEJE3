package practice1;

public class BoxingUnboxing {
public static void main(String[] args) {
//	PDT to NPDT: Wrapperclassname.valueOf(pdt);
//	NPDT to PDt: 1) obj_ref.pdtValue();
//	             2) wrapperclassname.parsePdt();
//	Boxing
	int a =100;
	Integer intobj = Integer.valueOf(a);
	System.out.println("a : "+a);
	System.out.println("intobj : "+intobj);
	
//	Unboxing 2 ways
	int b= intobj.intValue();
	System.out.println("b : "+b);
	
	String abc = "100";
	int c = Integer.parseInt(abc); 
	System.out.println("c : "+c);
	double d = Double.parseDouble(abc); 
	System.out.println("d : "+d);
	

	
}  
}
