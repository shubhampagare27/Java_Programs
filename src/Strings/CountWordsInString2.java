package Strings;

public class CountWordsInString2 {

	public static void main(String[] args) {
     
		String s= "Hi I Am Shubham";
		System.out.println("Number of words in string="+(s.split("\\s+").length));
	}
   }
