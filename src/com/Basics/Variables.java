package com.Basics;

public class Variables {
	String subject;
	String auther;
	int price;
	
	public void bookstore() {
		System.out.println("Subject is="+subject);
		System.out.println("Mathematics book auther is="+auther);
		System.out.println("Mathematics book price is="+price);
		
	}
	
	public static void main(String[] args) {
		Variables s=new Variables();
		s.subject="Mathematics";
		s.auther="Shubham";
		s.price=500;
		
		s.bookstore();
	}

}
