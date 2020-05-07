import java.util.Scanner;
@SuppressWarnings("unused")

public class operations{
	/** gets two matrices and multiples them
	 * @return two matrices multiplied
	 */
	public static void multiply(){
		Scanner in = new Scanner(System.in);
		System.out.print("Are we multiplying a matrix by a scalar, or two matrices together?\n\"1\" for scalar, \"2\" for two matrices: ");
		int mode = in.nextInt();
		
		if(mode == 1) {//mult by scalar
			System.out.print("Scalar to multiply matrix by: ");
			int scalar = in.nextInt();
			int matrix[][] = matrixHelpers.getMatrix();
			System.out.println("Result of multiplying matrix by " + scalar + ": ");
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					System.out.print((scalar * matrix[i][j]) + " ");
				}
				System.out.println();
			}
		}
		
		else { //mult 2 matrices
			int matrices[][][] = matrixHelpers.getTwoMatrices("multiply");
			if(matrices == null) {
				in.close();
				return; //not equal in columns of matrix 1 and rows of matrix 2
			}
			matrixHelpers.printDouble(matrices);
			System.out.print("Test: ");
			int test = 0;
			if(in.hasNext()) test = in.nextInt();
			System.out.print(test);
		}
		
		in.close();
		return;
	}
}