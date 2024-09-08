package Strings;

public class Sample {

	public static void main(String[] args) {
		String s= "How Are You";
		s=s.toLowerCase();
		System.out.println("Character\tFrequency");
		
		for(char ch='a'; ch<='z'; ch++) {
			int count=0;

			for(int i=0; i<s.length(); i++) {
				
				if(ch==s.charAt(i))
					count++;
			}
			
			if(count!=0)
				System.out.println(ch+ "\t\t" +count);
		}
	}
}
