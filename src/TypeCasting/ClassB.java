package TypeCasting;

public class ClassB extends ClassA{
	public void m3() {
		System.out.println("ClassB m3 method");
		}
		
		public void m4() {
			System.out.println("ClassB m4 method");
		}

	public static void main(String[] args) {
		ClassB ref=new ClassB();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
		
  	//	Upcasting
		ClassA newRef=ref;
		newRef.m1();
		newRef.m2();
		
		
	//	Upcasting
		ClassA ref3=new ClassB();
		
		ref3.m1();
		ref3.m2();  

	}

}
