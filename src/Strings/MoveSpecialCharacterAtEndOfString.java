package Strings;

public class MoveSpecialCharacterAtEndOfString {
	

	public static String moveSpecialCharacter(String str) {
		
		String sp = "[^a-zA-Z0=9\\s+]";
			String Specialchar = "";
		String  letter = "";
		
		for (int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			if (String.valueOf(c).matches(sp)) {
				
				Specialchar = Specialchar + c;
			}
			
			else {
				letter = letter + c;
				
			}
			

		}
		
		
		return (letter + Specialchar);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Helsu85o33gm,dms.&*nfleg";
		
		System.out.println(moveSpecialCharacter(str));
		

	}

}
