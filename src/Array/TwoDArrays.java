package Array;

public class TwoDArrays {

	public static void main(String[] args) {
               
		int[][] worldPopulation = {
				{3343,4476,7654,9980,5756,9893,7883},     // 0 index-->> country 1
				{8568,9840,9084,6435,6754},               // 1 index-->> country 2
				{7635,3189,8687,9086,8506,6565} // 2 index-->> country 3
		};
		
		System.out.println("worldPopulation is="+worldPopulation+"and length is"+worldPopulation.length);
		System.out.println("worldPopulation[0] is="+worldPopulation[0]+"and length is"+worldPopulation[0].length);
		System.out.println("worldPopulation[1] is="+worldPopulation[1]+"and length is"+worldPopulation[1].length);
		System.out.println("worldPopulation[2] is="+worldPopulation[2]+"and length is"+worldPopulation[2].length);

		// Read single element.
		System.out.println("worldPopulation[1][2] is="+worldPopulation[1][2]);
		
       // Write and update Data.
		worldPopulation[1][2]= 5555;
		
		System.out.println("==Re==Reading====");
		System.out.println("worldPopulation[1][2] is="+worldPopulation[1][2]);
		
		System.out.println();
		
		// Read all
       for (int i=0; i<worldPopulation.length; i++)	{	
            for (int j=0; j<worldPopulation[i].length; j++) {
            	System.out.print(worldPopulation[i][j]+ "  ");
	}
         System.out.println();
       }
       
       // Three 1 D Array with 5 elements each.
       
       int [][] arr=new int [3][5];
       
       System.out.println();
       for (int i=0; i<arr.length; i++)	{	
           for (int j=0; j<arr[i].length; j++) {
           	System.out.print(arr[i][j]+ "  ");
	}
        System.out.println();
      }
      
    // giving sizes we need to put the data later. Hence data initially would be zero.
       // Giving data first wwe need no to give size.
       
       // Explore enhanced for loop for 2 D arrays.  
       
       }
}
