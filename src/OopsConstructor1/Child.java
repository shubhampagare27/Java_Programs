
package OopsConstructor1;
public class Child extends Parent {

	public Child() {
		super(10);
		System.out.println("Child Constrcutor");
	}
 	
	public static void main(String[] args) {
		Child c=new Child();
		
	}
     
}
