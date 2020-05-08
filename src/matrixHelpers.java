import java.util.Scanner;

public class matrixHelpers{
	/** getMatrix initializes and returns a single matrix
	 * params: none
	 * @return single matrix
	 */
	public static double[][] getMatrix(Scanner in){
		System.out.print("Please enter the number of rows: ");
		int rows = in.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = in.nextInt();
		double toReturn[][] = new double[rows][columns];
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= columns; j++) {
				System.out.println("Number at: (" + i + "," + j + ")");
				toReturn[i-1][j-1] = in.nextDouble();
			}
		}
		
		System.out.println("Matrix: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(toReturn[i][j] + " ");
			}
			System.out.println();
		}
		return toReturn;
	}
	
	/** getTwoMatrices initializes and returns two matrices
	 * params: none
	 * @return a 3d matrix, index 0 holds the first matrix and index 1 holds the second matrix
	 */
	public static double[][][] getTwoMatrices(Scanner in, String mode){
		System.out.println("Initializing first matrix.");
		System.out.print("Please enter the number of rows: ");
		int rows = in.nextInt();
		System.out.print("Please enter the number of columns: ");
		int columns = in.nextInt();
		double toReturn[][] = new double[rows][columns];
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= columns; j++) {
				System.out.println("Number at: (" + i + "," + j + ")");
				toReturn[i-1][j-1] = in.nextDouble();
			}
		}
		
		System.out.println("Initializing second matrix.");
		System.out.print("Please enter the number of rows: ");
		int rows1 = in.nextInt();
		
		if(mode.equals("multiply") && columns != rows1) {
			System.out.println("The number of columns of the first matrix and the number of rows of the second matrix must match to multiply.");
			return null;
		}
		
		System.out.print("Please enter the number of columns: ");
		int columns1 = in.nextInt();
		
		if(mode.contentEquals("add") || mode.contentEquals("subtract")) {
			if(columns != columns1 || rows != rows1) {
				System.out.println("Matrices must have the same dimensions to add/subtract.");
				return null;
			}
		}
		
		double toReturn1[][] = new double[rows1][columns1];
		for(int i = 1; i <= rows1; i++) {
			for(int j = 1; j <= columns1; j++) {
				System.out.println("Number at: (" + i + "," + j + ")");
				toReturn1[i-1][j-1] = in.nextDouble();
			}
		}
		
		double toReturnFinal[][][] = {toReturn, toReturn1};
		System.out.println("Matrices:");
		printDouble(toReturnFinal);
		return toReturnFinal;
	}
	
	/** prints out a single matrix
	 * @params a matrix
	 * @return nothing
	 */
	public static void printSingle(double[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	/** prints out two matrices from a 3d array
	 * @param matrices
	 * @return nothing
	 */
	public static void printDouble(double[][][] matrices) {
		for(int q = 0; q < 2; q++) {
			if(q == 0) System.out.println("Matrix 1:");
			else System.out.println("Matrix 2:");
			for(int i = 0; i < matrices[q].length; i++) {
				for(int j = 0; j < matrices[q][0].length; j++) {
					System.out.print(matrices[q][i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}