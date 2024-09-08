package Strings;

public class FirstLetterOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method L
     String str = "My Name Is Shubham";
     
     splitWords(str);
    		
    		 //
	}

	private static void splitWords(String str) {
		// TODO Auto-generated method stub
		String words[]=str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			String s = words[i];
			
			System.out.print(s.charAt(0));
		}
	}

}
