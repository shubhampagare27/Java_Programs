package controlstatement;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		long no;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The No.=");
		no=sc.nextLong();
		
		int length=0;
		while (no>0)  {
			System.out.println(no);
			no=no/10;
			length++;	
		}
		System.out.println("length of gievn no is=" + length);
		sc.close();
	}

}
