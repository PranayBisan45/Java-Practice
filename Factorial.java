import java.util.Scanner;

public class Factorial {
	public static void Ans (int i,int n,int fac) {
		if (i==n) {
			fac*=n;
			System.out.println(fac);
			return;
		}
		if (n==0) {
			fac = 1;
			System.out.println(fac);
			return;
		}
		fac*=i; 
	    Ans(i+1,n,fac);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =sc.nextInt();
		System.out.println("The factorial of a number is :  ");
		Ans(1,a,1);
		sc.close();
	}
}