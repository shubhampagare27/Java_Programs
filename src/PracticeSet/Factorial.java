package PracticeSet;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		  //Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc=new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of the number: "+fact); 
	}

}
