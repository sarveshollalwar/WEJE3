package practice1;

public class Summaationoffirstfivechar {
public static void main(String[] args) {
	char ch='a';
	int sum=0;
	while(ch<='e')
	{
		sum=sum+ch;
		ch++;
	}
	System.out.println(sum);
	System.out.println(ch);
}
}
