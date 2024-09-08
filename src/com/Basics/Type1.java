package com.Basics;

public class Type1 {
	
	    static int b=36;
	    int y=70;
	    // static method.
	public static void method2() {
		System.out.println("value of b is="+b);
		System.out.println("static variable in static method="+b);
			}
	   // non static method.
	public void method3() {
		System.out.println("this is instance type method");
		System.out.println("value of y is ="+y);
	}

	public static void main(String[] args) {
	   // calling static method
		method2();
	   // calling non static method
		Type1 t=new Type1();
		t.method3();
	}
}
