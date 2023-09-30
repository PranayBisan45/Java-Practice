import java.util.Scanner;

public class NaturalRecursion {
	public static void add(int z, int x,int sum) {
		if (z==x) {
			sum += x;       //sum = sum+x;
			System.out.println(sum);
			return;
		}
		sum +=z;           //sum = sum+z;
		add(z+1,x,sum);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		//int a = 1;
		System.out.println("The sum of numbers is:  ");
		//add(a,n,0);
		add(1,n,0);
		sc.close();
	}
}