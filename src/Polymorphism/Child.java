package Polymorphism;

public class Child extends Parent{
	
         public  void marry() {
		
		System.out.println("Child wants to marry Aliya");
	}
         
	public static void main(String[] args) {
		//child specific output.
		 Parent p=new Child();
	        p.marry();
	           
	}

}
