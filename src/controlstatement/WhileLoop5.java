package controlstatement;

import java.util.Scanner;

public class WhileLoop5 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Value of x=");
		x=sc.nextInt();		
		
		while (x<11)  {
		
			if (x%3==0)
				System.out.println(x);
			x++;
			
		}
		sc.close();

	}

}
