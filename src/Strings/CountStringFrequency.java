package Strings;

public class CountStringFrequency {

	public static void main(String[] args) {
    String s="Hi I Am Shubham";
   s= s.toLowerCase();
   System.out.println("Character\tFrequency");
   
   for(char ch='a'; ch<='z'; ch++) {
	   int count=0;

	   for(int i=0; i<s.length(); i++) {
		    if(ch ==s.charAt(i))
		    count++;
	   }
	   if(count!=0)
	      System.out.println(ch+ "\t\t" + count);
	   
	  }
	}
}
