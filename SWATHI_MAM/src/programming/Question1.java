package programming;


// Que) can we call main methid of one class in another class?

public class Question1 
{
	
	public static void main(String[] args) 
	{
		System.out.println("main method of class Task1");
	}
	
}
class Task2
{
public static void main(String[] args) {
	System.out.println("main method of class Task2");
	Question1.main(null);
}	
}

//ans: yes we can call main method of one class in another class.
