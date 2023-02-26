package com.jspiders.designpattern.factorydesign.mobile;

import java.util.Scanner;

public class MobileDriverMain 
{
	private static Scanner sc;
	private static Mobile mobile;
	private static boolean loop = true;

	private static Mobile factory()
	{
		System.out.println("Select Mobile "+"\n 1) Samsung "+ "\n 2) Iphone"+
				"\n 3) Oneplus"+"\n 4) Nokia"+"\n 5) Exit");
		sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) 
		{
		case 1: mobile= new Samsung();
		return mobile;
		case 2: mobile= new Iphone14();
		return mobile;
		case 3: mobile= new Oneplus();
		return mobile;
		case 4: mobile= new Nokia();
		return mobile;
		case 5: 
		default: loop = false;
		System.out.println("Invalid input");
		}
		sc.close();
		return mobile;  
	}

	public static void main(String[] args) 
	{
		while(loop)
		{
			try{
				factory().start();
			}
			catch (Exception e) {
				System.out.println("no mobile selected");
			}

		}



	}
}
