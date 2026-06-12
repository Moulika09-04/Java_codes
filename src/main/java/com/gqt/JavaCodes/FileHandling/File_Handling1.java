package com.gqt.JavaCodes.FileHandling;
import java.io.*;
public class File_Handling1 {

	public static void main(String[] args)throws FileNotFoundException, IOException{
		String P1="D:\\Input.txt";
		String P2="D:\\Output.txt";
		FileInputStream fis = new FileInputStream(P1);
		int temp;
		FileOutputStream fos= new FileOutputStream(P2);
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}

}
