package Strings;

public class CountWordsInString {

	public static void main(String[] args) {
    String s= "Hi I Am Shubham";
    int len=s.length();
    int count=1;
    
    for (int i=0; i<len-1; i++){
    	
    	if(s.charAt(i)==' ' && s.charAt(i+1)!= ' ') {
    		count++;
    	}	
         }
       System.out.println("Number of words in string="+count);
	  }

     }
