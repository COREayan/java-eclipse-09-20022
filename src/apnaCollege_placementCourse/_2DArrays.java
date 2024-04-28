package apnaCollege_placementCourse;
import java.util.*;

public class _2DArrays {
	public static void main(String[] args) {
		// a) Creating a 2D Array - with new keywork
		//		int[][] marks = new int[3][3];
		/*
		 * b) Taking a matrix as an input and printing its elements.
		 * 
//			Scanner sc = new Scanner(System.in);
//			int rows = sc.nextInt();
//			int cols = sc.nextInt();
//			int[][] numbers = new int[rows][cols];
//			
//			for (int i=0; i<rows; i++) {
//				for (int j=0; j<cols; j++) {
//					numbers[i][j] = sc.nextInt();
//				}
//			}
//			
//			for (int i=0; i<rows; i++) {
//				for (int j=0; j<cols; j++) {
//					System.out.print(numbers[i][j]+" ");
//				}
//				System.out.println();
//			}
		 * */
		
		// c) Searching for an element x in a matrix.
		/*
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] numbers = new int[rows][cols];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (numbers[i][j]==x) {
					System.out.println("x found at location ("+i+", "+j+") ");
				}
			}
		}
		*/
		
		try (//	HOMEWORK PROBLEMS
				//	1. Print the spiral order matrix as output for a given matrix of numbers.
		Scanner sc = new Scanner(System.in)) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int[][] numbers = new int[row][col];
			
			for (int i=0; i<row; i++) {
				for (int j=0; j<col; j++) {
					numbers[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("The Spiral Order Matrix is : ");
			
			int rowStart = 0;
			int rowEnd = row-1;
			int colStart = 0;
			int colEnd = col-1;
			
			while(rowStart<=rowEnd && colStart<=colEnd) {
				// 1
				for (int i=colStart; i<=colEnd; i++) {
					System.out.print(numbers[rowStart][i]+" ");
				}
				rowStart++;
				
				// 2
				for (int j=rowStart; j<=rowEnd; j++) {
					System.out.print(numbers[j][colEnd]+" ");
				}
				colEnd--;
				
				// 3
				for (int i=colEnd; i>=colStart; i--) {
					System.out.print(numbers[rowEnd][i]+" ");
				}
				rowEnd--;
				
				// 4
				for (int j=rowEnd; j>=rowStart; j--) {
					System.out.print(numbers[j][colStart]+" ");
				}
				colStart++;
				
			}
		}
	}
}











