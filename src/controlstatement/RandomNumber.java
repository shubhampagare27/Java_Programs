package controlstatement;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
         int num=15;
         System.out.println("Enter the random number="+num);
         int x=100;
         for(int i=1;i<=num;i++) {
        	 
        	 Random y=new Random();
        	  int z=y.nextInt(x);
        	  System.out.println(z);
        	 
         }
	}

}
