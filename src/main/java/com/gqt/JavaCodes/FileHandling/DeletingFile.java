package com.gqt.JavaCodes.FileHandling;

import java.io.File;
public class DeletingFile {
    public static void main(String[] args) {
        File file = new File("D:\\Output.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
