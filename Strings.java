import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println(Name);
		System.out.println(Name.length());
		sc.close();
	}
}