/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		imprimir((matrix));
		System.out.println(" ");
		int[][] matrixtraspuesta = tarsponer(matrix);
		imprimir((matrixtraspuesta));
	}

	public static int[][] tarsponer(int matrix[][]) {
		int[][] matrixtraspuesta = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				matrixtraspuesta[j][i] = matrix[i][j];
			}

		}
		return matrixtraspuesta;

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
