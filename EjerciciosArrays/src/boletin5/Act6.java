/**
 * 
 */
package boletin5;

/**
 * 
 */
public class Act6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[10][6];
		rellenarmatrix(matrix);
		imprimir((matrix));

	}

	public static void imprimir(int matrix[][]) {
		int valormaximo = 0;
		int valorminimo = 1000;
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (valormaximo < matrix[i][j]) {
					valormaximo = matrix[i][j];
				}
				if (valorminimo > matrix[i][j]) {
					valorminimo = matrix[i][j];
				}
			}
			System.out
					.println("el valor maximo y minimo de la tabla " + i + " es " + valormaximo + " y " + valorminimo);
			valorminimo = 1000;
			valormaximo = 0;
		}

	}

	public static void rellenarmatrix(int matrix[][]) {

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				matrix[i][j] = (int) (Math.floor(Math.random() * (0 + 1000 + 0)));
			}
		}
	}

}
