import java.util.Scanner;

public class NewArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numbers");
		int no = sc.nextInt();
		int Number[] = new int [no];
	
		for (int i=0;i<no;i++) {
			Number [i] = sc.nextInt();
			}
		
		int x = sc.nextInt();
		
		for (int i=0;i<no;i++) {
			if(Number [i]==x) {
			System.out.println("The index at which x occurs is  "+ i);
			}
		System.out.println("The increment in numbers is  "+ Number[i]);
		}
		sc.close();
	}
}