import java.util.Scanner;

public class stringRec {
	public static void addX(String str,int idx,int count,String newstr) {
		if(idx == str.length()) {
			for(int i =1;i<=count;i++) {
				newstr+='x';
			}
			System.out.print(newstr);
			return;
		}
	    char current = str.charAt(idx);
		if (current == 'x') {
			count++;
			addX(str,idx+1,count,newstr);
		} else {
			newstr +=current;
			addX(str,idx+1,count,newstr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "axbcxxd";
		addX(str,0,0,"");
		sc.close();
	}
}