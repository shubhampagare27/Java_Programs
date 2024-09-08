package controlstatement;
import java.util.Scanner;
public class Result {
	public static void main(String[] args) {
		System.out.println("This is 10th class result");
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Shubham's marks=");
		marks=sc.nextInt();
		if(marks>35 & marks<50) {
			System.out.println("The Result is C grade");
		}
		else if(marks>50 & marks<75) {
			System.out.println("The Result is B grade");
		}
		else if(marks>75 & marks<85) {
			System.out.println("The Result is A grade");
		}
		else if(marks>85) {
			System.out.println("The Result is A+ grade");
		}
		else {
			System.out.println("shubham is fail");
		}
	     sc.close();
		}
}
