package javaprograms;
import java.util.*;

public class OldCarReplacement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many years old car");
		int years = sc.nextInt();
		int showroomprice = 300000;
		double depvalue=0;
        
		switch(years) {
		case 1: depvalue=0.1*showroomprice;break;
		case 2: depvalue=0.2*showroomprice;break;
		case 3: depvalue=0.3*showroomprice;break;
		case 4: depvalue=0.5*showroomprice;break;
		case 5: depvalue=0.6*showroomprice;break;
		default: System.out.println("invalid input");
		}
		double amtpayable = showroomprice-depvalue;
		System.out.println("The original price of car is: "+showroomprice);
		System.out.println("The old car is "+years+" years old");
		System.out.println("The depriciate value on showrrom price is "+depvalue);
		System.out.println("The amount on which car can be sold is "+amtpayable);
	}

}
