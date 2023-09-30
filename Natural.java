import java.util.Scanner;
public class Natural {
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=0;
		int n = sc.nextInt();
		int i = 1;
		for(i=1;i<=n;i++) {
			//sum= sum+i;
			sum+=i;
		}
	System.out.println("The sum of n natural number is  "+sum);
	sc.close();
	}
}