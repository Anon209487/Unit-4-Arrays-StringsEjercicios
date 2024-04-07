/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act3 {

	/**
	 * @param args
	 */

	public void main(String[] args) {

		int[][] matrix = new int[3][6];
		rellenarmatrix(matrix);
		suma((matrix));
	}

	public static void suma(int matrix[][]) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				matrix[i][j] = 10 * i + j;
			}
		}
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
				matrix[i][j] = 10 * i + j;
			}
		}
	}
}
