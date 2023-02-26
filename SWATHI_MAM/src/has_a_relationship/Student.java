package has_a_relationship;

public class Student {
private String s_name;
private int s_id;
private long s_phno;

Student(String s_name, int s_id, long s_phno) {
	this.s_name = s_name;
	this.s_id = s_id;
	this.s_phno = s_phno;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public long getS_phno() {
	return s_phno;
}
public void setS_phno(long s_phno) {
	this.s_phno = s_phno;
}

}
