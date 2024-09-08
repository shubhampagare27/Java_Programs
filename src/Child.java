
public class Child extends Parent {
        
	
            public void bike() {
		
		System.out.println("child bike ");
	}
 	
	public static void main(String[] args) {
		// is a type of  relation
		Child c=new Child();
		c.ancesstorLand();
	    c.land();
		c.bike();
		
		// has a type of relation
		//Parent p=new Parent();
    		//p.land();
	}

}
