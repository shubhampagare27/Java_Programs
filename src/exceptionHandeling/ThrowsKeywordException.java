package exceptionHandeling;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsKeywordException {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Hi");
		System.out.println("How are you");
		String s=null;
	
		Thread.sleep(1000);
		System.out.println(10/0);
		
		System.out.println("I am fine");

	}

}
