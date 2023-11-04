import java.util.Scanner;

public class sortRec{
	public static boolean arrSorted(int arr[], int idx) {
		if(idx == arr.length-1) {
			return true; 
		}
		if(arr[idx] < arr[idx+1]) {
			return arrSorted(arr,idx+1);
		} else {
		return false;
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//int arr [] = {1,2,4,3,5};
		int arr[] = {1,2,3,4,5};
		System.out.println(arrSorted(arr,0));
		sc.close();
	}
}