package com.gqt.JavaCodes.FileHandling;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Handling4 {
	public static void main(String[] args)throws FileNotFoundException, IOException{
		String P1="D:\\Input2.txt";
		String P2="D:\\Output2.txt";
		FileInputStream fis = new FileInputStream(P1);
		BufferedInputStream bis= new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos= new FileOutputStream(P2);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
			bos.write(temp);
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();
		
	}

}

