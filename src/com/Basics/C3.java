package com.Basics;

public class C3 {
        	int x;
			public C3 (int val) {
				this();
				this.x=val;			
				System.out.println("int argument type constructor");	
			}			
			public C3 () {				
				System.out.println("Char argument type constructor");
			}			
			public void m1() {			
				System.out.println(x);
			}
			public static void main(String[] args) {			
				C3 var=new C3(20);
				var.m1();

	}

}
