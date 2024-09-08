package exceptionHandeling;

public class Throw_Keyword_Exception {


		public static  void m1()  {
			
			throw new ArithmeticException();
		}

		public static void main(String[] args)  {
			System.out.println("Hi");
			System.out.println("How are you");
			
			m1();
			
			System.out.println("I am fine");

		}

	}


