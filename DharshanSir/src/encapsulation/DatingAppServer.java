package encapsulation;

public class DatingAppServer {
private String username;
private String height;
private int age;
private char gender;
private String city;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public void setHeight(String height) {
	this.height = height;
}


public String getHeight() {
	return height;
}

public void setAge(int age) {
	this.age = age;
}


public void setGender(char gender) {
	this.gender = gender;
}

public void setCity(String city) {
	this.city = city;
}

public int getAge() {
	return age;
}
public char getGender() {
	return gender;
}
public String getCity() {
	return city;
}
public DatingAppServer(String username, String height, int age, char gender, String city) {
	this.username = username;
	this.height = height;
	this.age = age;
	this.gender = gender;
	this.city = city;
}
public void display()
{
	System.out.println(this.username);
	System.out.println(this.height);
	System.out.println(this.gender );
	System.out.println(this.city);
}
public void matcher()
{
	System.out.println("Match found: "+username+" ❤️❤️❤ Pooja ");
}
}
