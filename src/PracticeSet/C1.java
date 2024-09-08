package PracticeSet;

public class C1 {
	
	 int a;
	 float b;
	 double c;
	public C1(int x) {
		this(234.75f);
		this.a=x;
		System.out.println("this is int type constructor");
		System.out.println(a);
	}
public C1 (double d) {
		this(23);
		this.c=d;
		System.out.println("this is double type constructor");
		System.out.println(c);
	}
public C1 (float f) {
	this.b=f;
	System.out.println("this is float type constructor");
	System.out.println(b);
	
}
	public static void main(String[] args) {
   C1 var = new C1(344.743);
	}

}
