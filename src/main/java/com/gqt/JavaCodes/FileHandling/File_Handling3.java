package com.gqt.JavaCodes.FileHandling;
import java.io.*;
public class File_Handling3 {
	public static void main(String[] args) throws IOException{
		String p1="D:\\Input3.txt";
		String p2="D:\\Output3.txt";
		FileReader fr= new FileReader(p1);
		BufferedReader br= new BufferedReader(fr);
		int temp;
		FileWriter fw= new FileWriter(p2);
		BufferedWriter bw= new BufferedWriter(fw);
		while((temp=fr.read())!=-1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

}

