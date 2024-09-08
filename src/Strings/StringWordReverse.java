package Strings;

public class StringWordReverse {

	public static void main(String[] args) {
    String str="My Name Is Shubham";
    String words[]=str.split(" ");
    String reverseString="";
    
    for(int i=0; i<words.length;i++) {
    	System.out.println(words[i]+" ");
    }
    System.out.println("");
    for(int i=words.length-1; i>=0;i--) {
    	reverseString=(reverseString+words[i]+" ");
    }
    
    
	System.out.println(reverseString);
	}

}
