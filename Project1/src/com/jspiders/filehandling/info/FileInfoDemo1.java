package com.jspiders.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfoDemo1 {
public static void main(String[] args) {
	File file = new File("hello.txt");
	
	if(file.exists())
	{
		System.out.println("File already exist");
	}
	else
	{
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Created");
	}
	System.out.println("File name: "+file.getName());
	System.out.println("File Path: "+file.getAbsolutePath());
	System.out.println("File length is: "+file.length());
	System.out.println("File is readable: "+file.canRead());
	System.out.println("File is Writable:"+file.canWrite());
	System.out.println("File is Executable: "+file.canExecute());
	
	
}
}
