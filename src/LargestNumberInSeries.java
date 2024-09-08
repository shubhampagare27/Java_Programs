import java.util.Scanner;

public class LargestNumberInSeries {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter The First Number");
int a=sc.nextInt();
System.out.println("Enter The Second Number");
int b=sc.nextInt();
System.out.println("Enter The Third Number");
int c=sc.nextInt();

// Logic 1
/*if(a>b && a>c) {
	System.out.println("a is the largest number");
}
if(b>a && b>c) {
	System.out.println("b is the largest number");
}
if(c>a && c>b) {
	System.out.println("c is the largest number");
}*/
 // Logic 2: using ternary operator.

int Largest1= a>b?a:b;
int Largest2= c>Largest1?c:Largest1;

System.out.println(Largest2);
}

}
