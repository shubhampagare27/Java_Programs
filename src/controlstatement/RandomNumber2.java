package controlstatement;
import java.util.Scanner;
import java.util.Random;

public class RandomNumber2 {

	
	public static void main(String[] args) {
		        int Number;
		        //create objects
		        Scanner sc = new Scanner(System.in);
		        Random rand = new Random();
		        
		        System.out.print("Please enter maximum range: ");
		        Number=sc.nextInt();
		        
		        for(int loop=1; loop<=10; loop++)
		        {
		            System.out.println(rand.nextInt(Number));
		        }
		       sc.close(); 
		    }
	
}
