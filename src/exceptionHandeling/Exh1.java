package exceptionHandeling;

public class Exh1 {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("How are you");
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		System.out.println("I am fine");
	}

}
