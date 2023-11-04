import java.util.Scanner;

public class SelectionSort {
	public static void printSort(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {4,2,7,1,8,5,-4};
		
		//Selection Sort
		for (int i=0; i<arr.length-1;i++) {
			int smallest=i;
			for (int j=i+1;j<arr.length;j++) {
				if (arr[smallest]>arr[j]) {
					int temp = arr[smallest];
					arr[smallest]=arr[j];
					arr[j]=temp;
				}
			}
		}
		printSort(arr);
		sc.close();
	}
}