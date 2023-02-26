package javapro;

public class ConditionalOpr {
static int a=20;
static int b= 30;
static int c= 40;
static int d=50;
public static void main(String[] args) {
	System.out.println(a>b?a:b>c?b:c>d?c:d);
	System.out.println(a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d);
}


}
