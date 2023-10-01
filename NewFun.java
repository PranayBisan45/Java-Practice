import java.util.Scanner;

public class NewFun {
	public static int isEven (int n) {
		if (n%2 == 0) {
			System.out.println("The Number is Even");
		} else {
			System.out.println("The number is odd");
		}
		return n;
	}
	
	public static void main ( String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		isEven(a);
		sc.close();
	}
}