import java.util.Scanner;

public class transformations{
	/**
	 * prints transpose of a matrix
	 * @param iin scanner
	 */
	public static void transpose(Scanner in) {
		double[][] matrix = matrixHelpers.getMatrix(in);
		System.out.println("Result of transposing:");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}