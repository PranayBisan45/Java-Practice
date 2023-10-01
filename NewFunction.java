import java.util.Scanner;

public class NewFunction {
	public static int sum (int a,int b) {
		int add = a+b;
		return add;
	     }
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int summation = sum(a,b);
		System.out.println("The sum of two numbers is"+summation);
		sc.close();
	}
}