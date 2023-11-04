import java.util.Scanner;

public class Repeat  {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your name");
		int i = 0;
		String Name = sc.nextLine();
		for (i=0;i<=10;i++)
		{
			System.out.println("Your name is   "+Name+i);
		}
		sc.close();
	}
}