/**
 * 
 */
package boletin3;

import java.util.Arrays;


/**
 * 
 */
public class Act6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] t = { 10, 1, 5, 8, 9, 2 };
		int numElementos = 3;

		int[] resultados = suma(t, numElementos);

		System.out.println(Arrays.toString(resultados));
	}

	public static int[] suma(int t[], int numElementos) {
		if (numElementos <= 0 || numElementos > t.length) {
			return new int[0];
		}

		int[] resultados = new int[t.length - numElementos + 1];

		for (int i = 0; i <= t.length - numElementos; i++) {
			int suma = 0;
			for (int j = i; j < i + numElementos; j++) {
				suma += t[j];
			}
			resultados[i] = suma;
		}

		return resultados;
	}

}
