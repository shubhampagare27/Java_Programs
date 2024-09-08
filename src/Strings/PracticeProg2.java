package Strings;

public class PracticeProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "ABCD";
		String replace = "xy";
		
		int Pos =1;
		int rep = 2;
		
	String aftrep = 	s.substring(0, 1)+ replace+s.substring(Pos+2);
	
	System.out.println(aftrep); 
	}

}
