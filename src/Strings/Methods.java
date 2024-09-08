package Strings;

public class Methods {

	public static void main(String[] args) {
     
		String name="Salman";
		String rev="";
		/*System.out.println(name.length());
		System.out.println(name.charAt(3));*/
   for (int i=name.length()-1; i>=0;i--) {
			
			rev=rev+name.charAt(i);
			
		}

		System.out.println(rev);
  
		
	}

}
