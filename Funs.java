import java.util.Scanner;

public class Funs {
	public static int mul(int a, int b) {
	int multi = a*b;
	return multi;
}

	public static int add(int a, int b) {
		int add = a+b;
		return add;
	}
	
	public static int sub(int a, int b) {
		int Sub;
		if (a>b ) {
			Sub = a-b;
		} else {
			Sub = b-a;
		}
		return Sub;
	}
	
	public static double div (int a,int b) {
		double div;
		if (a>b) {
			div = a/b;
		} else {
			div = b/a;
		}
		return div;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division\n");

		System.out.println("Enter your choice");
		int c = sc.nextInt();

		System.out.println("Enter Two Numbers");

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int addition = add(a,b);
		int subtraction = sub(a,b);
		int multiplication = mul(a,b);
		double Division = div(a,b);
		if(c== 1) {
			System.out.println("The addition of two numbers is "+addition);
		}
		if(c == 2) {
			System.out.println("The subtraction of two numbers is "+ subtraction);
		}
		if(c == 3) {
			System.out.println("The multiplication of two numbers is "+multiplication);
		}
		if(c==4) {
			System.out.println("The division of two numbers is "+Division);
		}
		sc.close();
	}
	
}