
public class Array {
	int x=10;
	int y=20;
	int z=30;
	
	public static void main(String[] args) {
		int [] var=new int[5];
		var[0]=10;
		var[1]=20;
		var[2]=30;
		var[3]=40;
		var[4]=50;
		
		//for each loop
		for (int i:var) {
			
			System.out.println(i);
		}
	
		System.out.println(var.length);
	}
	

}
