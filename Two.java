import java.util.Scanner;
public class Two {
	public static void main (String [] args) {
		System.out.println("Enter your table");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		sc.close();
	}
}