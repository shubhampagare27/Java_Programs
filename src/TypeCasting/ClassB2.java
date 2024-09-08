package TypeCasting;

public class ClassB2 extends ClassA2{
	public void m3() {
		System.out.println("ClassB2 m3 method");
		}
		
		public void m4() {
			System.out.println("ClassB2 m4 method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA2 ref=new ClassA2();
		
		ref.m1();
		ref.m2();
		
		//Down casting --thoug compiled program we will get runtime exception
		ClassB2 newRef=(ClassB2)ref;
		
		newRef.m3();
		
		//down casting-get the compile error
		ClassB2 newRef1=(ClassB2) new ClassA2();
		 newRef1.m3();
		
	}

}
