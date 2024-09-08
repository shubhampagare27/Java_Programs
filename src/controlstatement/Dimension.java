package controlstatement;

import java.util.Scanner;

public class Dimension {

	public static void main(String[] args) {
		int length, breadth;    
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter The Length=");
	    length=sc.nextInt();
	    System.out.print("Enter The breadth=");
	    breadth=sc.nextInt();
	    
	    if (length==breadth) {
	    	System.out.println("This is square");
	    }
	    else if (length>breadth) {
	    	System.out.println("This is rectangle");
	    }
	    else {
	    	System.out.println("This is not square or rectangle");
	    }
	    sc.close();
	}

}
