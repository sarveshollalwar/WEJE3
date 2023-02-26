package encapsulation;

public class Engine {
	Engine(int cc)
	{
		this.cc=cc;
	}
private int cc;

public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}


}
