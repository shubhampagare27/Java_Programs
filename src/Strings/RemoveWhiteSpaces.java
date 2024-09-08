package Strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
          String str = "   My    Name     Is    Shubham   ";
          
          // Approach 1
         String str1 =  str.replaceAll("\\s", "");
         
         System.out.println(str1);
         
         
         // Approach 2

String str2 =  str.replaceAll(" ", "");
         
         System.out.println(str2);
	}

}
