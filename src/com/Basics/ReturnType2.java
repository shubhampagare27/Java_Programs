package com.Basics;

public class ReturnType2 { 
	
	public static int summation(int x,int y) {
	    int z=x+y;
	   return z;
	}
	public long multiplication(long b,long c) {
		long a=b*c;
	    return a;
	}
	public static void main(String[] args) {
		// calling static method.
		
		System.out.print("The value of z=");
		System.out.println(summation(32,56));
		//calling non static method.
		
		ReturnType2 t=new ReturnType2();
		t.multiplication(21,7);
		
		System.out.print("The value of a=");
		System.out.println(t.multiplication(21,7));
		
		
	}
}
