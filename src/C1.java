
public class C1 {

	public C1 (int val) {
		
		this(12.348);
			
			
			System.out.println("int argument type constructor");	
		}
		
		public C1 (double d) {
			
			System.out.println("double argument type constructor");
		}
		
		public C1 (float f) {
			this(10);
			System.out.println("float argument type constructor");	
		}

	public static void main(String[] args) {
		C1 t=new C1(12.5f);

	}

}
