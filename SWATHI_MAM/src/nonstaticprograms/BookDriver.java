package nonstaticprograms;

public class BookDriver {
public static void main(String[] args) {
	Book obj = new Book("chetan", "half girlfriend", 250);
	obj.display();
	Book obj2 = new Book("chetan", 250);
	obj2.display();
	Book obj3 = new Book("sandeep", "motivation");
	obj3.display();
}
}
