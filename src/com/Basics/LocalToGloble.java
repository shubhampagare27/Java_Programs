package com.Basics;

public class LocalToGloble {
	
	static int i;
	
	
	public static void Result(int y,int z) {
		
		int x=y+z;
		System.out.println("The value of local variable x="+x);
		int i=x;
		System.out.println("The value of globle variable i="+i);
		}
	
	public static void main(String[] args) {
		Result(56,30);
	}
}
