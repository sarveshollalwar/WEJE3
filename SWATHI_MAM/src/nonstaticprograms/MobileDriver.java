package nonstaticprograms;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile samsung = new Mobile("Samsung",8,64,16000);
		Mobile vivo = new Mobile("Vivo",8,256,20000);
        Mobile redmi = new Mobile("Redmi",4,128,14000);
        Mobile oppo = new Mobile("Oppo",6,64,15000);
        Mobile apple = new Mobile("Apple",8,156,60000);
		samsung.display();
		vivo.display();
		redmi.display();
		oppo.display();
		apple.display();

	}
}
