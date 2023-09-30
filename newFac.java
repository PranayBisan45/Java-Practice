import java.util.Scanner;

public class newFac {
	public static int Factorial(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if (n%2==0) {
			return Factorial(x,n/2)* Factorial(x,n/2);	
		} else {
			return Factorial(x,n/2)* Factorial(x,n/2)* x;
		}
		
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and n");
		int x=sc.nextInt();
		int n= sc.nextInt();
		int ans=Factorial(x,n);
		System.out.println("The answer is : ");
		System.out.println(ans);
		sc.close();
	}
}