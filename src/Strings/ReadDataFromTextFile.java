package Strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
    // Approach 1: Using FileReader and BufferedReader.
		
	/*	FileReader fr= new FileReader("C:\\\\Users\\\\Dell\\\\Desktop\\\\software testing\\\\NewText.txt");
	   BufferedReader br= new BufferedReader(fr);
	 
	  String str;
	   while((str=br.readLine())!= null) {
		 System.out.println(str);
	 }
		
	// Approach 2: Using File and Scanner class.
		
		File file=new File("C:\\\\Users\\\\Dell\\\\Desktop\\\\software testing\\\\NewText.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			} */
		
	// Approach 3: Using useDelimiter method.
		
		File file=new File("C:\\Users\\Dell\\Desktop\\software testing\\NewText.txt");
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		     }
	            }
