package nonstaticprograms;

public class Employee {
	int id;
	String ename;
	double salary;
public Employee(int id, String ename, double salary) {
		
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
public void display()
{
	System.out.println(this.id);
	System.out.println(this.ename);
	System.out.println(this.salary);
}

}
