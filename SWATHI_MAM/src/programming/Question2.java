package programming;

//What will happen if we dont give the string  [] args parameter to the main method?
public class Question2 {
public static void main() {
	System.out.println("Testing main method without any parameters");
}
}

//ans: the compiler will compile the source code but it will throw runtime error as:
//Error: Main method not found in class P4, please define the main method as:
//	   public static void main(String[] args)
//	or a JavaFX application class must extend javafx.application.Application