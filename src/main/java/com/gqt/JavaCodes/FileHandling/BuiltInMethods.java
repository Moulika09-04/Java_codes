package com.gqt.JavaCodes.FileHandling;

import java.io.File;
import java.io.IOException;

public class BuiltInMethods {

	public static void main(String[] args) throws IOException {
		String p1="D:\\File1.txt";
		File f1= new File(p1);
		f1.createNewFile();//create the file specified in the path
		System.out.println(f1.exists());//checks if the file in the path is present or not
		System.out.println(f1.canExecute());//checks if the file have rights to execute or not
		System.out.println(f1.canWrite());//checks if the file is have write access or not
		System.out.println(f1.canRead());//checks if the file is have read access or not
		System.out.println(f1.getAbsoluteFile());//display the file path
		System.out.println(f1.getCanonicalPath());//display the file path
		System.out.println(f1.getFreeSpace());//display the space unallocated in bytes
		System.out.println(f1.getName());//display the file name
		System.out.println(f1.getParent());//display the root path
		System.out.println(f1.getPath());//display the file path
		System.out.println(f1.getTotalSpace());//display the space available in bytes
		System.out.println(f1.getUsableSpace());//display the usable space
		System.out.println(f1.hashCode());//unique value for the file object
		System.out.println(f1.isAbsolute());//checks if it is absolute path
		System.out.println(f1.isDirectory());//checks if the path points to directory
		System.out.println(f1.isFile());//checks if the path points to file
		System.out.println(f1.isHidden());//checks if the path points to hidden files
		File f2=new File("F:\\hidden.txt");
		System.out.println(f2.isHidden());
		System.out.println(f1.lastModified());//last modified value in terms of long
		System.out.println(f1.length());//prints the total number of characters
//		File f3=new File("F:\\File2.txt");
//		System.out.println();
	}

}
