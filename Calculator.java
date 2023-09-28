import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Panay's Calcy");
		System.out.println("\n1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) Remainder");
		System.out.println("\nSelect the operation");
		int operation = sc.nextInt();
		int a = 0;
		System.out.println("Enter Two Numbers");
		int b = sc.nextInt();
	    int c = sc.nextInt();
		switch (operation) {
		case 1: a = b+c;
		break;
		case 2: a= b-c;
		break;
		case 3: a= b*c;
		break;
		case 4: a= b/c;
		break;
		case 5: a= b%c;
		break;
		default: System.out.print("Invalid Option");
		}
	System.out.println("Result : "+ a);
	sc.close();
	}
}