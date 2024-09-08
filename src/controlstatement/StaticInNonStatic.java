package controlstatement;

public class StaticInNonStatic {
		    
		   static int y=70;
		
		public void method3() {
			System.out.println("this is instance type method");
			System.out.println("value of y is ="+y);
		}

		public static void main(String[] args) {
			
			StaticInNonStatic t=new StaticInNonStatic();
			t.method3();
			 
	       
	   
	}

}
