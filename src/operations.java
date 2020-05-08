import java.util.Scanner;
@SuppressWarnings("unused")

public class operations{
	/** gets two matrices and multiples them
	 * @return two matrices multiplied
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
		
		else { //mult 2 matrices
			double matrices[][][] = matrixHelpers.getTwoMatrices("multiply", in);
			if(matrices == null) {
				return; //not equal in columns of matrix 1 and rows of matrix 2
			}
			matrixHelpers.printDouble(matrices);
		}
		
		return;
	}
}