package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountStringFrequencyUsingHashMap {

	public static void main(String[] args) {

		String str= "HiThisisShubham";
		
		Map<Character, Integer> charCount=new HashMap();
		
		for(int i=0; i<str.length(); i++) {
			Character ch=str.charAt(i);
			 
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}
			else{
				charCount.put(ch, 1);
			}
		}
		
		System.out.println("charcter frequency in string is="+charCount);
			
	}

}
