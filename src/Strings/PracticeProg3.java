package Strings;

public class PracticeProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "ABCD";
		
		String replace = "123";
		
		String aftrep = s.substring(0, (s.length()-3)) + replace ;
		
		System.out.println(aftrep);
		
		
		// with concat  method
		
		String aftrep1 = s.substring(2).concat(replace);
		
		System.out.println(aftrep1);

	}

}
