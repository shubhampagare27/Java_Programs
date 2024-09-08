package controlstatement;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		int x,y;
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of first variable");
		 x=sc.nextInt();		
		System.out.println("enter the value of second variable");
		 y=sc.nextInt();
		if (x>0 & y>0) {
			
			if (x>y) {
				System.out.println("X is the max no");
			}
			else {
				if (x==y)
					System.out.println("x & y are equal");
				else
				System.out.println("Y is the max no");
			}
		} 
		else {
			System.out.println("it is negative no");
		}
	}

}
