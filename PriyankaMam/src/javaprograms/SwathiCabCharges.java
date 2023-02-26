package javaprograms;
import java.util.Scanner;


public class SwathiCabCharges {
	
	
	 public static void conditional() {
		 double bill= 1800;
			double discount=bill>10000?bill*10/100:bill*5/100;
			System.out.println(discount);
	 }
	public static void main(String[] args) {
		int fare=0;//why do we have to declare and intialize fare variable,
		           //can't we just declare the variable.
//even if its  local variable i tried using it as instance variable
//it got error as Cannot make a static reference to the non-static field fare
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("the distance travelled is?");
		int distance=sc.nextInt();
		if(distance<=10) {
			fare=80;
		}
		else if(distance<=20&&distance>=11){
			fare=80+(distance-10)*6;
		}
		else if(distance>=21&&distance<=30) {
			fare=80+60+(distance-20)*5;
			}
		else if(distance>=31) {
			fare=80+60+50+(distance-30)*4;
			}
		else {
			System.out.println("invalid error");
		}
		
	System.out.println("The fare for "+distance+" km is "+fare+" rs");
		
		

	}

}
