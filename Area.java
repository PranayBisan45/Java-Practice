import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double area = a*b;
	double perimeter = 2*a+2*b;
	System.out.println("The area of a square is  "+area);
	System.out.println("The perimeter is  "+perimeter);
	sc.close();
	}
}