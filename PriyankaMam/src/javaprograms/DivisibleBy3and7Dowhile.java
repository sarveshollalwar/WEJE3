package javaprograms;

public class DivisibleBy3and7Dowhile {
public static void main(String[] args) {
	int n =0;
    int m= 100;
    do {
    	if (n%3==0&&n%7==0) {
			System.out.println(n);
		 }
    	n++;
		
	   } while (n<=m);
	
}
}
