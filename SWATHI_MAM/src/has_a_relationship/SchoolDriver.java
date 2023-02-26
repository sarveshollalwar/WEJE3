package has_a_relationship;
import java.util.Scanner;

public class SchoolDriver {
public static void main(String[] args) {
	School sch = new School("DPS UNIVERSITY");
	Scanner sc = new Scanner(System.in);
	boolean exit =true;
	while(exit)
	{
		System.out.println("1. Get Admission\n2.Cancel Admission\n3.Display Student Details\n4.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:{
			       System.out.println("Enter Student Name");
			       String name=sc.next();
			       System.out.println("Enter Student id");
			       int id= sc.nextInt();
			       System.out.println("Enter student contact");
			       long phno=sc.nextLong();
			       System.out.println(sch.admit_student(new Student(name,id,phno)));
			       break;
		       }
		case 2:
			   sch.cancelAdmission();
			   break;
		case 3:
			 sch.display();
			 break;
			 
		case 4:
			  exit=false;
			  System.out.println("Thank You");
			  break;
	    default :
	    	   System.out.println("Invalid choice");
		}
	}
}
}
