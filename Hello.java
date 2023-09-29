import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int i =0;
		System.out.println("Enter the name ");
		
		String name = sc.nextLine();
		
		for(int i=0;i<10;i++) {
			System.out.println("name is "+ name + " "+i);
		}
		sc.close();
	}
}
