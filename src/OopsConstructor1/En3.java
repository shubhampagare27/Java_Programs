package OopsConstructor1;

public class En3 {
	
	
		En2 e;
		
		public En3() {
		       	e=new En2();
		}
		
		public void getInfo(long accNo)
		{
			System.out.println(e.getBalance(accNo));
		}
		public void creditAmount(double  amount)
		{
	          e.setBalance(amount);	
		}
		
	public static void main(String[] args) {
		En3 en=new En3();
		en.getInfo(1234567);
		
		en.creditAmount(1234.55);
		
		en.getInfo(1234567);
		
	}
	
}
