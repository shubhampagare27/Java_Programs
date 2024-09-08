package controlstatement;

public class Table2 {

	public static void main(String[] args) {
		int x=1;
		int table=3;
		while(x<11) {
			
			int c=(x*table);
			if (c%2!=0)
			System.out.println(c);
			x++;
		}
	}

}
