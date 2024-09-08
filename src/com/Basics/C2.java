package com.Basics;

public class C2 {
	  int x;
    double y;
    
	 public C2(int val) {
		 this(5373.7388);
		 this.x=val;
		 System.out.println("int argument type constructor");
		 System.out.println(x);
	 }
	 public C2(double d) {
		 this.y=d;
		 System.out.println("double argument type constructor");
		 System.out.println(y);
	 }
	 public void m2() {
		 System.out.println(x);
	 } 
	public static void main(String[] args) {    
		C2 t=new C2(35);
		}
	  }
