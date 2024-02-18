






import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		//int[][] arr = {{2,5,-4},{7,-9,-1}};
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter # of rows: ");
		int n = input.nextInt();
		System.out.print("Enter # of columns: ");
		int m = input.nextInt();
		int[][] arrA = new int[n][m];
		int[][] arrB = new int[n][m];
		int[][] arrC = new int[n][m];
	
		System.out.println("Enter arrA: ");
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++) {
				arrA[i][j] = input.nextInt();		
			}
		}
		System.out.println("Enter arrB: ");
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++) {
				arrB[i][j] = input.nextInt();		
			}
		}
		// now, we calculate the sum of the matrices arrA & arrB
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		// Now, print the matrix arrC (which is the sum of matrices)
		System.out.println("Sum of the matrices: ");
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < m; j ++) {
				System.out.printf("%d ", arrC[i][j]);
			}
			System.out.println();
		}
	}
}

