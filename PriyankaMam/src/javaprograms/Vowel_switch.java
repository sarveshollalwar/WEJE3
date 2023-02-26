package javaprograms;

import java.util.Scanner;

class Vowel_switch {

	public static void main(String[] args) {

	char ch = 'Z';
	if (ch>='a'&&ch<='z') 
	{
		
	
	switch (ch) 
	{
	case 'a': {
		  System.out.println("its vowel");break;
	        }
		
		
	case 'e': {
		     System.out.println("its vowel");break;
	        }
	case 'i': {
	     System.out.println("its vowel");break;
              }

	case 'o': {
	     System.out.println("its vowel");break;
             }
	case 'u': {
	     System.out.println("its vowel");break;
             }
	

	default: {System.out.println("it not a vowel");
		break;
	         }
 
	}
	}
	else {
		System.out.println("invalid input");
		
	}

}
}