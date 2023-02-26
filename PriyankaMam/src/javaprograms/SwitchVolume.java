package javaprograms;

public class SwitchVolume {

	public static void main(String[] args) {
		char ch ='b';
		switch(ch)
		{
		case 'c': int s= 15;
		          int volumecube= s*s*s;
		          System.out.println("volume of cuboid is "+volumecube); break;
		case 'p': int r= 25;
		          double volumesphere= 3.14*r*r*r;
		          System.out.println("volume of sphere is "+volumesphere);break;
		case 'b': int l= 10;
		          int b= 20;
		          int h= 30;
		          int volumecuboid= l*b*h;
		          System.out.println("volume of cuboid is "+volumecuboid);break;
		}

	}

}
