package controlstatement;
import java.util.Scanner;
public class Result2 {

	public static void main(String[] args) {
		byte a1,a2,a3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks in Physics");
		a1=sc.nextByte();
		System.out.println("Enter your marks in Chemistry");
		a2=sc.nextByte();
		System.out.println("Enter your marks in Mathematics");
		a3=sc.nextByte();
		
		float avg =((a1+a2+a3)/3.0f);
		
		System.out.println("Your overall Percentage is="+avg);
		
		if (avg>=40 && a1>=35 && a2>=35 && a3>=35) {
			System.out.println("Congratulation you are PASSED");
		}
		else {
			System.out.println("Sorry, you are FAILED. Please try again");
		}
		sc.close();
		}
}
