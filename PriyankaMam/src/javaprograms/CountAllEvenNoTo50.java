package javaprograms;

public class CountAllEvenNoTo50 {
public static void main(String[] args) {
	int n=0;
	int m=50;
	int count=0;
	while (n<=m) 
	  {
		if(n%2==0) 
		{
			System.out.println(n);
			count++;
		}
		n++;
	  }
	System.out.println("no of even nos between 0 to 50 are "+count);
}
}
  