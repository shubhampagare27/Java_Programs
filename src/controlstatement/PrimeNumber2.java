package controlstatement;

public class PrimeNumber2 {

	public static void main(String[] args) {
		   int no=7;
           int y=0;

		for (int x=2;x<no;x++) {
			
			if (no%x==0) {
				
				y++;
			}
			
		}
		
		if (y>0) {
			
			System.out.println(no + " is not prime no");
			
		}
		else {
			System.out.println(no + " is prime no ");
		}
           
		}

	
}


