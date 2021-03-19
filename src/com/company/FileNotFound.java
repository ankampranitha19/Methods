package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileNotFound {
    public static void main(String args[]) {
        try {
            File f = new File("C:\\programs");
            FileReader fr=new FileReader(f);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
System.out.println("file not found");
        }
    }
}
