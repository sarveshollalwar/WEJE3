package programming;

public class Strong {
	public static void main(String[] args) {
		int num =143; int temp= num; int lastdigit; int sum = 0;
		while(num>0){
			lastdigit= num%10;
			sum=sum+fact(lastdigit);
			num=num/10;
		}
		if(sum==temp){
			System.out.println("Its a strong number");
		}
		else{
			System.out.println("Its not a strong number");
		}
	}
	public static int fact(int n){
		int fact=1;
	    while(n>0){
		fact = fact*n;
		n--;
	    }
	    return fact;
	}
}
