package Strings;

public class LengthOfEachWordInString {

	public static void main(String[] args) {
     String s="Hi I Am Shubham";
     s=s+ " ";    //to count last word also.
      int start=0;
     for(int i=0; i<s.length(); i++) {
    	 char ch= s.charAt(i);
    	
    	if(ch== ' ') {
    		String word=s.substring(start, i);
    		System.out.println(word + "-" + word.length());
    		start=i+1;
    	  }
            }
	         }
	           }
