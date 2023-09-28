import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Click on a button");
		int Button = sc.nextInt();
		switch (Button) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default :
			System.out.println("Invalid Button");
		}
		sc.close();
	}
}