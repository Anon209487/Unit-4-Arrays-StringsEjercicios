/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act9 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[5][5];
		rellenarmatrix(matrix);
		imprimir((matrix));

		System.out.println("\n" + "Es la matriz magica? " + magica(matrix));

	}

	public static boolean magica(int matrix[][]) {
		boolean magica = false;
		int[][] matrixtraspuesta = matrix;
		int sumacolumnas = 0;
		int sumafilas = 0;
		for (int contador = 0; contador < matrix.length; ++contador) {

			for (int j = 0; j < matrix[contador].length; ++j) {
				sumacolumnas = matrixtraspuesta[j][contador] + sumacolumnas;
			}

			for (int n = 0; n < matrix[contador].length; ++n) {
				sumafilas = matrixtraspuesta[contador][n] + sumafilas;
			}

			System.out.println(sumacolumnas + " " + sumafilas);
			if (sumacolumnas == sumafilas) {
				magica = true;
			}
			sumacolumnas = 0;
			sumafilas = 0;
		}
		return magica;
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
				matrix[i][j] = (int) (Math.floor(Math.random() * (1 + 2 + 0)));
				;
			}
		}
	}
}
