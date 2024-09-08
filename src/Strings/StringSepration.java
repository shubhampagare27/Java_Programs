package Strings;

public class StringSepration {

	public static void main(String[] args) {
		String actual="Ve122loci343tyCo5656rpor4563ate";
		String no="";
		String chars="";
		for (int i=0; i<actual.length();i++) {
			
			if (Character.isDigit(actual.charAt(i))) {
				
				no=no+actual.charAt(i);
				
			}else
			{
				chars=chars+actual.charAt(i);
			}
			
		}
		System.out.println("No from String is ==" + no);
		
		System.out.println("Char from String is ==" + chars);
		
	}

}
