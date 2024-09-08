package controlstatement;
import java.util.Scanner;
public class SwitchCase2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String month;
		System.out.print("Enter the month=");
		Scanner sc=new Scanner(System.in);
		month=sc.nextLine();
		switch(month){
			case "january":System.out.println("it is 1st month of the year");
			break;
			case "february":System.out.println("it is 2nd month of the year");
			break;
			case "march":System.out.println("it is 3rd month of the year");
			break;
			case "april":System.out.println("it is 4th month of the year");
			break;
			case "may":System.out.println("it is 5th month of the year");
			break;
			case "june":System.out.println("it is 6th month of the year");
			break;
			case "july":System.out.println("it is 7th month of the year");
			break;
			case "august":System.out.println("it is 8th month of the year");
			break;
			case "september":System.out.println("it is 9th month of the year");
			break;
			case "october":System.out.println("it is 10th month of the year");
			break;
			case "november":System.out.println("it is 11th month of the year");
			break;
			case "december":System.out.println("it is 12th month of the year");
			break;
			default:
			System.out.println("it is not month of the year");
		}
     sc.close();
	}

}
