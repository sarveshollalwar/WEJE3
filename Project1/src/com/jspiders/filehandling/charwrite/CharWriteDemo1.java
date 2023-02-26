package com.jspiders.filehandling.charwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriteDemo1 {
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
	FileWriter obj = new FileWriter(file);
	obj.write("My first file writing ");
	System.out.println("data written in file");
	obj.close();

}
}
