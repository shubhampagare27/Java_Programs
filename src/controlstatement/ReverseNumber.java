package controlstatement;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number To Reverse=");
		number=sc.nextInt();
		while(number>=65){
			
			System.out.println(number);
			number--;
		}
       sc.close();
	}

}
