import java.util.Scanner;

public class Ok {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a = sc.nextInt();
		int sum = 0;
		while(a>=0) {
			sum = sum + a;
			a-- ;
		}
	System.out.println("The sum of numbers is :"+ sum);
	sc.close();
	}
}