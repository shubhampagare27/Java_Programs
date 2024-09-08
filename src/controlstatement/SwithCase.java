package controlstatement;
import java.util.Scanner;
public class SwithCase {
	public static void main(String[] args) {
		String week;
		System.out.println("Enter the day =");
		Scanner sc=new Scanner(System.in);
		week=sc.nextLine();
		switch(week){
			case "monday":System.out.println("it is 1st day=weekday");
			break;
			case "tuesday":System.out.println("it is 2nd day=weekday");
			break;
			case "wednesday":System.out.println("it is 3rd day=weekday");
			break;
			case "thursday":System.out.println("it is 4th day=weekday");
			break;
			case "friday":System.out.println("it is 5th day=weekday");
			break;
			case "saturday":System.out.println("it is 6th day=weekend");
			break;
			case "sunday":System.out.println("it is 7th day=weekend");
			break;
			default:
			System.out.println("it is not week day");
		}
		sc.close();
		}

}
