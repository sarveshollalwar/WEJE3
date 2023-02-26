package javaprograms;
public class SwitchDelivery 
{
	public static void main(String[] args) 
	{
		int weight = 2000;
		char type = 'O';

		if(weight<=100 && type =='E'){
			System.out.println("The express charges would be: "+100);}
		else if(weight<=100 && type =='O'){
			System.out.println("The ordinary charges would be: "+80);}
		else if(weight>=101&&weight<=500 && type=='E' ) {
			System.out.println("The express charges would be: "+200);}
		else if(weight>=101&&weight<=500 && type=='O' ) {
			System.out.println("The ordinary charges would be: "+150);}
		else if(weight>=501&&weight<=1000 && type=='E'){
			System.out.println("The express charges would be: "+250); }
		else if(weight>=501&&weight<=1000 && type=='O'){
			System.out.println("The ordinary charges would be: "+210); }
		else if(weight>1000 && type=='E' ){
			System.out.println("The express charges would be: "+300); }
		else{System.out.println("The ordinary charges would be: "+250);}

	}
}
