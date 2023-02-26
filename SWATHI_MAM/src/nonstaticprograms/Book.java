package nonstaticprograms;

public class Book {
	String author;
	String title;
	double price;

	public Book(String title, double price) {
		
		this.title = title;
		this.price = price;
	}
	public Book(String author, String title) {
		
		this.author = author;
		this.title = title;
	}
	public Book(String author) {
		
		this.author = author;
	}
	
    public Book(String author, String title, double price) {
		
		this.author = author;
		this.title = title;
		this.price = price;
	}
public void display()
{
	System.out.println(this.author);
	System.out.println(this.title);
	System.out.println(this.price);
}



}
