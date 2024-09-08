package com.Basics;

public class Type2 {
	
	// static method 
	public static void m1() {
		int x=10;
		System.out.println(x);
		
	}

	public static void main(String[] args) {
	  // calling static method from Type2 class.	 
		Type2.m1();
      // calling static method from Type1 class.	 		
		Type1.method2();
	  // calling non static method from Type1 class.
		Type1 t=new Type1();
		t.method3();
		
	}

}
