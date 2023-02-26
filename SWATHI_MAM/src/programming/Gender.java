package programming;
import java.util.Scanner;

public class Gender {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.next();
	System.out.println("Enter your age");
	int age = sc.nextInt();
	System.out.println("Enter your gender");
	char gender = sc.next().charAt(0);

	System.out.println(name);
	System.out.println(age);
	System.out.println(gender);
}
}
