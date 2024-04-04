/**
 * 
 */
package boletin2;

import java.util.Arrays;

/**
 * 
 */
public class Act2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[100];
		int contadorindice = 0;
		int contadorindicefinal = 0;
		for (int i = 0; i < 10; i++) {
			Arrays.fill(enteros, i);
			Arrays.fill(enteros, contadorindice, contadorindicefinal, i);
			contadorindice = contadorindicefinal + 1;
			contadorindicefinal = contadorindicefinal + i;
		}

	}

}
