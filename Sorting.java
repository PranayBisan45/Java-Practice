import java.util.Scanner;

public class Sorting {
	//public static void printArray (int array[]) {
		//for (int i=0;i<array.length;i++) {
			//System.out.print(array[i]+" ");
		//}
		//System.out.println();
	//}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int array[] = {5,4,3,2,6,10,9};
		
		//Bubble Sort
		for (int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	//printArray(array);
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}
}