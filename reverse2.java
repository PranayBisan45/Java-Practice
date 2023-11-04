import java.util.Scanner;

public class reverse2 {
	public static void rev(String str, int index) {
		if (index==0) {
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		rev(str,index-1);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "nasiB yanarP";
		rev(str,str.length()-1);
		sc.close();
	}
}