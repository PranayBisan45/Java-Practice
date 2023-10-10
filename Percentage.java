import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int total = a+b+c;
	float aggregate = total/3;
	double percentage = (total/300)*100;
	System.out.println("The aggregate of marks is  "+aggregate);
	System.out.println("The percentage of marks is  "+percentage);
	sc.close();
	}
}