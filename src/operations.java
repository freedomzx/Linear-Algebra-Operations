import java.util.Scanner;
@SuppressWarnings("unused")

public class operations{
	/** gets two matrices and multiples them
	 * @return two matrices multipled
	 */
	public static void multiply(){
		int matrices[][][] = matrixHelpers.getTwoMatrices("multiply");
		if(matrices == null) return; //not equal in columns of matrix 1 and rows of matrix 2
		matrixHelpers.printDouble(matrices);
		
		for(int i = 0; i < matrices[0].length; i++) {
			
		}
	}
}