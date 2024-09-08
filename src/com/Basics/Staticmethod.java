package com.Basics;

public class Staticmethod {
	
	public void summation(int x,int y) {
		int c=x+y;
		System.out.println(c);	
	}
	public static String multiplication() {
		String s="Hi I Am Shubham";
		return s;
		}
	public static void main(String[] args) {
		Staticmethod t=new Staticmethod();
		t.summation(56,34);
			
		System.out.println(multiplication());
		
				}
}
