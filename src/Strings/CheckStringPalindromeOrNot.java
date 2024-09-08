package Strings;

public class CheckStringPalindromeOrNot {
	
	public static boolean checkPalindrome(String str) {
		
		int len = str.length();
		String rev = "";
		
		for(int i=len-1; i>=0;  i--) {
			
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str))
			return true;
		else;
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "radayur";
		if( checkPalindrome(str)) {
			System.out.println("String is Palindrome !");
		}
		else {
			System.out.println("String is not Palindrome !");
		}

	}

}
