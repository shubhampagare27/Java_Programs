package Polymorphism;

public class P1 {
	
	// method overloading.
public void m1(int x,int y) {
		
		System.out.println("two int argument m1 method");
	}
	
   public void m1(int x) {
		
		System.out.println("int argument m1 method");
	}
   public void m1(String s) {
		
		System.out.println("String argument m1 method");
	}
	public static void main(String[] args) {
		
		P1 t=new P1();
		t.m1(67);
	}

}
