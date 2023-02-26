package has_a_relationship;

public class P1 {
	static String state;//first load
	static {
		
		state="maharashtra";//checks state variable
		System.out.println(state); 
//		check2();
	}
public static void check2()
{
	state="static method load hua bhai";
	System.out.println("method run zali");
}
	int check;
public void initializer(int n)
	{
		this.check=n;
	}
public static void main(String[] args) {
		    P1 obj = new P1();
		    System.out.println(obj);
		    obj.initializer(123);
		    System.out.println(obj.check);
		    obj=null;;
		    if(obj==null)
		    {
		    	System.out.println("object is null");
		    }
}
}