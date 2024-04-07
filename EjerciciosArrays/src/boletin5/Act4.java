/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matrix = new int[11][11];
		rellenarmatrix(matrix);
		imprimir((matrix));
	}

	public static void imprimir(int matrix[][]) {

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void rellenarmatrix(int matrix[][]) {

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				matrix[i][j] = i * j;
			}
		}
	}
}