package OopsConstructor1;

public class En1 {
	
	//Data Hiding with wrapping together member function

	private double accountBalance=1000;
	
	public double getBalance(long accNo) {
		
		return accountBalance;
	}
	
    public void setBalance(double amount) {
    	
    	this.accountBalance+=amount;
    }

	
}
