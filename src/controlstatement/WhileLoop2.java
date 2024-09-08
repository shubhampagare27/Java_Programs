package controlstatement;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		byte y=0;
		byte number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number=");
		number=sc.nextByte();
		while(y<=20) {
			
			System.out.println((2*y+(number))+1);
			y++;
			
		}
		sc.close();
	}

}
