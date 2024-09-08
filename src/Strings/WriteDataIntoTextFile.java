package Strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("C:\\Users\\Dell\\Desktop\\software testing\\NewText.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        
        bw.write("Hi this is shubham");
        bw.write("I am from Nashik");
       System.out.println("Finished");
        		 
         bw.close();
	    }
          }
