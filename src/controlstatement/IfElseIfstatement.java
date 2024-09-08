package controlstatement;

public class IfElseIfstatement {

	public static void main(String[] args) {
		int price =10000;
		System.out.println("Main Start"); 
		if(price<15000) {
			System.out.println("Purchase Realme");
		}
		else if (price>15000 & price<30000){
			System.out.println("Purchase Oneplus");
		}
		else if (price>30000 & price<50000){
			System.out.println("Purchase I phone");
		}
		else {
			System.out.println("Do Not Purchase The Mobile");
		}
		
		System.out.println("Main End");
		}

}
