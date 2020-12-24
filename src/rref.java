import java.util.Scanner;

public class rref{
	/**
	 * rrefs a matrix
	 * @param in scanner
	 */
	public static void gaussElim(Scanner in, double[][] matrix) {
		forwardElimination(matrix);
	}
	/**
	 * swaps 2 rows in a matrix
	 * @param matrix to be worked on
	 */
	public static void swapRow(double matrix[][], int i, int j) {
		for(int q = 0; q < matrix.length; q++) {
			double temp = matrix[i][q];
			matrix[i][q] = matrix[j][q];
			matrix [j][q] = temp;
		}
	}
	/**
	 * forward elim on matrix
	 * @param matrix
	 */
	public static void forwardElimination(double matrix[][]) {
		for(int i = 0; i < matrix.length; i++) {
			int indexMax = i;
			double valMax = matrix[indexMax][i];
			
			for(int j = i+1; j < matrix.length; j++) {
				if(Math.abs(matrix[j][i]) > valMax) {
					valMax = matrix[j][i];
					indexMax = j;
				}
			}
			if(matrix[i][indexMax] == 0) swapRow(matrix, i, indexMax);
			
			for(int j = i+1; j < matrix.length; j++) {
				double factor = matrix[j][i]/matrix[i][i];
				
				for(int q = i+1; q < matrix.length; q++) matrix[j][q] -= (matrix[i][q] * factor);
				
				matrix[j][i] = 0;
			}
		}
	}
	
	public static void backwardsElimination(double matrix[][]) {
		
	}
}