package javaprograms;

public class SwitchVowel {

	public static void main(String[] args) {
		char ch='z';
		
		switch(ch)
		{
		case 'a':case 'e': case 'i': case 'o': case 'u': 
		System.out.println("Its a vowel"); break;
		default: System.out.println("Its a consonant");
		}

	}

}
