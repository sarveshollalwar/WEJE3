package has_a_relationship;

public class School {
String school_name;
Student s;
School(String school_name)
{
	this.school_name=school_name;
}
public String admit_student(Student s)
{
	if(this.s==null)
	{
		this.s=s;
		return "Admission Successful";
	}
	else
	{
		return "No Seat Available";
	}
}
public void cancelAdmission()
{
	if(this.s==null)
	{
		System.out.println("No data found for student");
	}
	else
	{
		this.s=null;
		System.out.println("Admission Cancelled");
	}
}
public void display()
{
	if(this.s==null)
	{
		System.out.println("No student information found");
	}
	else {
		System.out.println("Student name: "+s.getS_name());
		System.out.println("Student id: "+s.getS_id());
		System.out.println("Student contact: "+s.getS_phno());
		System.out.println("School name: "+school_name);
	}
	}
	
}
