
public class Practiceprog {

	public static void main(String[] args) {
  
		
		String str = "all cows eat grass";
		
		String[] words = str.split(" ");
		String reverseString = "";
		
		for (String s : words) {
			String reverseWord = "";
			
		
			
			for (int i= s.length()-1; i>=0; i--) {
				
				reverseWord = reverseWord + s.charAt(i);
			}
				
				reverseString =	reverseString + reverseWord+ " ";
			
		}
			System.out.println(reverseString);
	}
	
}
