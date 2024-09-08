
public class Parent extends GrandParent  {
	
        public Parent() {
        	super(10);
        	System.out.println("Sub class constructor");
        }
	public void land() {
		
		System.out.println("Parent land");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.ancesstorLand();
		p.land();
	
        }

}
