package javapro;
import java.util.Scanner;
public class HappyNumber {
	public static int happy(int num){
		int sum=0;
		int ld=0;
		while(num>0){
			ld=num%10;
			sum= sum+(ld*ld);
			num=num/10;
		}return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if its happy or not");
		int num=sc.nextInt();
		int result=num;

		while(result>9){
			result=happy(result);
		}
		if(result==1)
			System.out.println("Its a Happy Number");
		else
			System.out.println("Its not a happy number");







	}
}
