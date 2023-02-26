package com.jspiders.filehandling.Delete;

import java.io.File;

public class DeleteFileDemo1 {
public static void main(String[] args) {
	File file = new File("hello.txt");
	if(file.exists())
	{
		file.delete();
		System.out.println("File is deleted");
	}
	else
	{
		System.out.println("file does not exist");
	}
}
}
