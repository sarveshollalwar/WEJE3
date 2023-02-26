package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {
public static void main(String[] args) {
	File file = new File("hello.txt");
	if(!file.exists()) {
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not created");
			e.printStackTrace();
		}
		
	}
	else {
		System.out.println("File name: "+file.getName());
		System.out.println("File Path: "+file.getAbsolutePath());
		System.out.println("File length is: "+file.length());
		System.out.println("File is readable: "+file.canRead());
		System.out.println("File is Writable:"+file.canWrite());
		System.out.println("File is Executable: "+file.canExecute());
		
	}
	
}
}

