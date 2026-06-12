package com.gqt.JavaCodes.FileHandling;
import java.io.*;
public class file_handling2 {

	public static void main(String[] args) throws IOException{
		String p1="D:\\Input1.txt";
		String p2="D:\\Output1.txt";
		FileReader fr= new FileReader(p1);
		int temp;
		FileWriter fw= new FileWriter(p2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();
	}

}
