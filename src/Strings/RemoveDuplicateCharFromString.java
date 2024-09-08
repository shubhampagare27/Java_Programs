package Strings;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
   String s="ssssshhhhubbbbhhhhaaaammmm";
   System.out.println("ORIGINAL WORD");
   System.out.println(s);
   String n="";
   char prevchar=' ';
   
   for(int i=0; i<s.length(); i++) {
	   
	   if(prevchar != s.charAt(i)) {
		   n= n+ s.charAt(i);
	   }
	   prevchar= s.charAt(i);
   } 
   System.out.println("NEW WORD");
   System.out.println(n);
	}
	 }
