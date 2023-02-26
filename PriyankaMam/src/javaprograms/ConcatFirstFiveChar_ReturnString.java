package javaprograms;

public class ConcatFirstFiveChar_ReturnString {
    public static String concat(char ch)
    {
    	
    	String res="";
    	for(char i=ch; ch<='e'; ch++)
    	{
    		res=res+ch;
    	}
    return res;
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(concat('a'));

	}

}
