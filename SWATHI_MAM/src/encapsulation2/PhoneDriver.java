package encapsulation2;

public class PhoneDriver {
public static void main(String[] args) {
	MobilePhone oneplus = new MobilePhone("OnePlus Nord", 25000);
	oneplus.setS1(new Simcard("9421764896", "JIO") );
	oneplus.phoneDetails1();
	System.out.println("-------------------------------------");
	MobilePhone google = new MobilePhone("Google Pixel", 30000);
	google.setS2(new Simcard("9580764896", "VodafoneIdea(VI)"));
	google.phoneDetails2();
	
}
}
