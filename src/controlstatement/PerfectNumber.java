package controlstatement;

public class PerfectNumber {

	public static void main(String[] args) {
		 int no=24;
         int sum=0;

		for (int x=1;x<no;x++) {
			
			if (no%x==0) {
				
				sum=sum+x;
			}
			
		}
		
		if (sum==no) {
			
			System.out.println(no + " is perfect no");
			
		}
		else {
			System.out.println(no + " is not perfect ");
		}
	}

}
