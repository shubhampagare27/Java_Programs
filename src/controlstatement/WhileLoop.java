package controlstatement;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int x=1;
		int number=5;
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number=");
		number=sc.nextInt();*/
		while(x<=10) {
			
			//if (x%14==0)
			System.out.println(x*number);
		//	System.out.println(x);

			x++;
		}
	}

}
