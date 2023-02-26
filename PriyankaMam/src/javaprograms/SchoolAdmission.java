package javaprograms;

public class SchoolAdmission {

	public static void main(String[] args) {

		int english= 55;
		int maths= 40 ;
		int science= 72;

		if(english>=80&& maths>=80&&science>=80)
		{
			System.out.println("go for pure science");
		}
		else if(english>=80&&science>=80&&maths>=60)
		{
			System.out.println("go for biology");
		}
		else if(english>=60&&maths>=60&&science>=60)
		{
			System.out.println("go for commerce");
		}
		else
		{
			System.out.println("join It career");
		}
	}

}
