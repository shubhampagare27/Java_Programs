package com.Basics;

public class GlobleToLocal {
	 int x;
	 
	 public static void main(String[] args) {
		
		
		 // 1st object
		 
		 GlobleToLocal a=new GlobleToLocal();
		 a.x=10;
		 System.out.println(a.x);
		 
		 
		 //2nd object
		 GlobleToLocal a1=new GlobleToLocal();
		 a1.x=30;
		 System.out.println(a1.x);
		 
		 
	}

}
