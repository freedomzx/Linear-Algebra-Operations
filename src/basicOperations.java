import java.util.Scanner;
@SuppressWarnings("unused")

public class basicOperations{
	/**
	 * adds 2 matrices together or adds a scalar to a matrix
	 * @param in scanner
	 */
	public static void add(Scanner in) {
		System.out.print("Are we adding a scalar to a matrix, or adding 2 matrices together?:\n\"1\" for scalar, \"2\" for two matrices: ");
		int mode = in.nextInt();
		
		if(mode == 1) { //add scalar
			System.out.print("Scalar to add to matrix: ");
			double scalar = in.nextDouble();
			double matrix[][] = matrixHelpers.getMatrix(in);
			System.out.println("Result of adding:");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					System.out.print((matrix[i][j] + scalar) +  " ");
				}
				System.out.println();
			}
		}
		
		else if(mode == 2) { //add 2 matrices
			double matrices[][][] = matrixHelpers.getTwoMatrices(in, "add");
			if(matrices == null) {
				return;
			}
			System.out.println("Result of adding:");
			for(int i = 0; i < matrices[0].length; i++) {
				for(int j = 0; j < matrices[0][0].length; j++) {
					System.out.print((matrices[0][i][j] + matrices[1][i][j]) + " ");
				}
				System.out.println();
			}
		}
		return;
	}
	
	/**
	 * subtracts either a scalar from a matrix or one matrix from another
	 * @param in scanner
	 */
	public static void subtract(Scanner in) {
		System.out.print("Are we subtracting a scalar from a matrix, or subtracting one from another?:\n\"1\" for scalar, \"2\" for two matrices: ");
		int mode = in.nextInt();
		
		if(mode == 1) { //sub scalar
			System.out.print("Scalar to subtract from matrix: ");
			double scalar = in.nextDouble();
			double matrix[][] = matrixHelpers.getMatrix(in);
			System.out.println("Result of subtracting:");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					System.out.print((matrix[i][j] - scalar) +  " ");
				}
				System.out.println();
			}
		}
		
		else if(mode == 2) { //sub 2 matrices
			double matrices[][][] = matrixHelpers.getTwoMatrices(in, "subtract");
			if(matrices == null) {
				return;
			}
			System.out.println("Result of subtracting:");
			for(int i = 0; i < matrices[0].length; i++) {
				for(int j = 0; j < matrices[0][0].length; j++) {
					System.out.print((matrices[0][i][j] - matrices[1][i][j]) + " ");
				}
				System.out.println();
			}
		}
		return;
	}
	
	
	/** gets two matrices and multiples them or multiplies a matrix by a scalar
	 * 
	 */
	public static void multiply(Scanner in){
		System.out.print("Are we multiplying a matrix by a scalar, or two matrices together?\n\"1\" for scalar, \"2\" for two matrices: ");
		int mode = in.nextInt();
		
		if(mode == 1) {//mult by scalar
			System.out.print("Scalar to multiply matrix by: ");
			double scalar = in.nextDouble();
			double matrix[][] = matrixHelpers.getMatrix(in);
			System.out.println("Result of multiplying matrix by " + scalar + ": ");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					System.out.print((scalar * matrix[i][j]) + " ");
				}
				System.out.println();
			}
		}
		
		else if(mode == 2){ //mult 2 matrices
			double matrices[][][] = matrixHelpers.getTwoMatrices(in, "multiply");
			if(matrices == null) {
				return; //not equal in columns of matrix 1 and rows of matrix 2
			}
			
			System.out.println("Result of multipling matrices: ");
			for(int i = 0; i < matrices[0].length; i++) {
				for(int j = 0; j < matrices[1][0].length; j++) {
					int sum = 0;
					for(int q = 0; q < matrices[0][0].length; q++) {
						sum += matrices[0][i][q] * matrices[1][q][j];
					}
					System.out.print(sum + " ");
				}
				System.out.println();
			}
		}
		
		else {
			System.out.println("Invalid multiplication mode.");
		}
		
		return;
	}
}