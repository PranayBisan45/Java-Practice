import java.util.Scanner;

public class printFib {
	public static void Fibonacci (int m, int n, int p) {
		if(p==0) {
			return;
		}
           int o = m+n;
           System.out.println(o);
           Fibonacci(n,o,p-1);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int c = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		Fibonacci(a,b,c-2);
		sc.close();
	}
}