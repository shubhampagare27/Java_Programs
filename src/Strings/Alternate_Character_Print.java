package Strings;

public class Alternate_Character_Print {

	public static void main(String[] args) {

		String s= "shubham";
		int len=s.length();
		String n="";
		for (int i=0; i<=len; i+=2) {
			
	 //  System.out.print(s.charAt(i));
			n=n+ s.charAt(i);
	   
		}
		System.out.println(n);

	  }

    }
