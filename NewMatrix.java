import java.util.Scanner;

public class NewMatrix {
	public static void main (String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Matrix");
		int rows= sc.nextInt();
		int cols= sc.nextInt();
		int matrix[] [] = new int [rows] [cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				matrix [i] [j] = sc.nextInt();
			}
		}
		System.out.println("The output matrix is");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+ " ");
				}
			     System.out.println();
		    }
		sc.close();
		}
	}