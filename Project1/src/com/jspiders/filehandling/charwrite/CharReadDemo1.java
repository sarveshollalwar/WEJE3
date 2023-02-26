package com.jspiders.filehandling.charwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharReadDemo1 {
public static void main(String[] args) throws IOException {
	File file = new File("firstfile.txt");
	if(file.exists())
	{
		System.out.println("file already exist");
	}
	else
	{
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not created");
			e.printStackTrace();
		}
		
	}
	FileReader obj = new FileReader(file);
//	System.out.println(obj.read());
	obj.close();
	Scanner sc = new Scanner(file);
	System.out.println("file reading");
	while(sc.hasNextLine())
	{
		System.out.print(sc.nextLine());
	}
	sc.close();
	
	

}
}
