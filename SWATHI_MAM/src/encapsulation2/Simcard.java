package encapsulation2;

public class Simcard {
private String simno;
private String sp;
public String getSimno() {
	return simno;
}
public String getSp() {
	return sp;
}
public void setSp(String sp) {
	this.sp = sp;
}
public void setSimno(String simno) {
	this.simno = simno;
}

public Simcard(String simno, String sp) {
	this.simno = simno;
	this.sp=sp;
}
public void simdetails()
{
	System.out.println("Service Provider : "+sp);
	System.out.println("Simno: "+simno);
}
}

