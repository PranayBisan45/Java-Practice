import java.util.Scanner;

public class recursion2 {
	public static int First = -1;
	public static int Last = -1;
	public static void Position (String str, int idx, char word) {
		if (idx == str.length()) {
			System.out.println(First);
			System.out.println(Last);
			return;
		}
		char currentChar = str.charAt(idx);
		if (currentChar == word) {
			if (First == -1) {
				First = idx;
			} else {
				Last = idx;
			}
		}
		Position (str, idx+1,word);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = "pabcarepacdac";
		Position (str,0,'a');
		sc.close();
	}
}