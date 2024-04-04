/**
 * 
 */
package boletin2;

import java.util.Arrays;

/**
 * 
 */
public class Act7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[5];
		int[] enteros2 = new int[5];
		int contadoraciertos = 0;
		for (int i = 0; i < enteros.length; i++) {

			enteros[i] = (int) (Math.floor(Math.random() * (1 - 100 + 1)));

		}
		for (int i = 0; i < enteros2.length; i++) {

			enteros2[i] = (int) (Math.floor(Math.random() * (1 - 100 + 1)));

		}
		for (int i = 0; i < enteros.length; i++) {
			if (enteros2[i] == enteros[i]) {
				contadoraciertos++;
			}
		}
		System.out.println(
				"SON IGUALES? : " + Arrays.equals(enteros2, enteros) + " numero de aciertos=  " + contadoraciertos);

	}

}
