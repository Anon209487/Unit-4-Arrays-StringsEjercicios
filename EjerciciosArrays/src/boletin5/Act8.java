/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		imprimir((matrix));

		System.out.println("\n" + "Es la matriz simetrica? " + simetrica(matrix));

	}

	public static boolean simetrica(int matrix[][]) {
		boolean simetrica = true;
		int[][] matrixtraspuesta = matrix;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrixtraspuesta[j][i] != matrix[i][j]) {
					simetrica = false;
				}
			}

		}
		return simetrica;

	}

	public static void imprimir(int matrix[][]) {

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
