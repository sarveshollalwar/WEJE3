package practice1;

public class Summationoffirstfivechar {
public static int charsum()
{
	char ch='a';
	int sum=0;
    while(ch<='e')
    {
	sum=sum+ch;
	ch++;
	}
    return sum;
}
public static void main(String[] args) {
	System.out.println(charsum());
	System.out.println();
}
}
