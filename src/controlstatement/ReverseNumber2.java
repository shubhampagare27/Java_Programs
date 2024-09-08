package controlstatement;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int no=12345;
		int rim=0;
		int rev=0;
		while (no!=0)  {
			
			rim=no%10;
			System.out.println(rim);
			rev=rev*10+rim;
			
			no=no/10;
			
		}

		System.out.println("Rev no is "+rev);
		//System.out.println("length of given no is " + length);
	
	
	}

}
