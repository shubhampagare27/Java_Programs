package controlstatement;

public class Length2 {

	public static void main(String[] args) {
		int no=123456789;
		int length=0;
		while (no!=0)  {
			System.out.println(no);
			no=no/10;
			
			length++;	
		}

		System.out.println("length of gievn no is " + length);
		

	}

}
