/**
 * 
 */
package boletin5;

import java.util.Arrays;

/**
 * 
 */
public class Act1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[3][6];

		matrix[0][0] = 0;
		matrix[0][1] = 30;
		matrix[0][2] = 2;
		matrix[1][0] = 75;
		matrix[0][5] = 5;
		matrix[2][2] = -2;
		matrix[2][3] = 9;
		matrix[2][5] = 11;
		// 4
		// [[1, 2, 3], [4, 5]]
		Arrays.deepToString(matrix);

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("  ");
		}

	}

}
