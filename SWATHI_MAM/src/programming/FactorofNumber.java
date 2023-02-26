package programming;

public class FactorofNumber {
public static void main(String[] args) {
	int num=90;
	for(int i=1; i<=90; i++)
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	
	//factor of a number is always be between the halff of its number
	//and  a number itself. eg: number is 90 half is 45 so till 45 there is factors 
	//then after 45 none number is factor of 90 . check below program(no need to check the nos after 45)
	
	int num2=90;
	for(int i=1; i<=num2/2; i++)
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
