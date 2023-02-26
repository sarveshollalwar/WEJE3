package javaprograms;
import java.util.Scanner;
public class Practice4 {
	public static void main(String[] args) {
	
		System.out.println(1+1);
		//System.out.println(true+true); cte boolean
		System.out.println("sarvesh"+10);
//		System.out.println(true+10); cte
		System.out.println('a'+26.55);
		System.out.println("sarvesh"+"onkar");
//      
	// conditional operator
		int b=41;
		String c= b%2==0?"even":"odd";
		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter 1st no");
		int x= sc.nextInt();
		System.out.println("eneter 2nd no");
		int y= sc.nextInt();
		System.out.println("enter 3rd no");
        int z= sc.nextInt();
        int res= x<y?x<z?x:z:y<z?y:z;
        System.out.println(res);
        
		
	}
	
           
}
