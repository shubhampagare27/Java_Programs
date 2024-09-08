
public class Child2 extends Parent {
	
	public void cash() {
		
		System.out.println("Chlid2 cash ");
	}
	public static void main(String[] args) {
		Child2 c2 = new Child2();

		c2.ancesstorLand();

		c2.land();
		c2.cash();

	}

}
