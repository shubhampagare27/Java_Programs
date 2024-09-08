package Strings;

public class CountNumberOfVowelsInString {

	public static void main(String[] args) {
     String s="Hi I Am Shubham";
            s = s.toLowerCase();
     char [] chars= s.toCharArray();
     
     int vowelCount=0;
     
     for(char c: chars) {
    	 
     switch(c) {
    	 case('a'):
    	 case('e'):
         case('i'):
    	 case('o'):
         case('u'):
        	 
    		 vowelCount++;
    		 break;
    		  }
    	        }
	 System.out.println("Number of vowels in String="+vowelCount);

	              }
                    }
