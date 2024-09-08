package Array;

public class ArrayDemo {

	public static void main(String[] args) {
   // single value container
		int state1pupulation= 563;
		int state2pupulation= 345;
		int state3pupulation= 765;
		int state4pupulation= 122;
		int state5pupulation= 766;
		
		// multi value container
		
		//int[] countrypopulation= new int [5]; //All the elements by default 0;
		
		// read single element
		
		// implicite way
		int[] countrypopulation= {435,465,756,234,898}; // Element by default have a initial value;
		
		   // explicite way. 
		//int[] countrypopulation=new int [] {435,465,756,234,898}; // Element by default have a initial value;

		System.out.println("countrypopulation  [0]= is "+ countrypopulation[0]);
		System.out.println("countrypopulation  [1]= is "+ countrypopulation[1]);


		
		
		//Read All element
		int [] countrypopulation2= {324,435,323,564,654}; // Element have by default initial value;
		for (int i=0; i<countrypopulation2.length; i++)
		{
		System.out.println("countrypopulation2  ["+i+"]= is "+ countrypopulation2[i]);
		}
		
		
		// write and update operation
   		int[] countrypopulation1 = new int [5];
		countrypopulation1[0]= 563;
		countrypopulation1[1]= 345;
		countrypopulation1[2]= 765;
		countrypopulation1[3]= 122;
		countrypopulation1[4]= 766;
		
	/*	for(int i=0; i<countrypopulation1.length; i++) {	
			System.out.println("countrypopulation1  ["+i+"]= is "+ countrypopulation1[i]);

		}
		*/
		
		// Enhanced For Loop or For Each Loop.
		int count=0;
		for (int ele : countrypopulation1) {
			count=count + ele;
			System.out.println(ele);
		}
		System.out.println("Population Count of entire country is=" +count);
		
		
		
	}

}
