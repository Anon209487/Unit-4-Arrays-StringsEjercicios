/**
 * 
 */
package boletin2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[7];
		for (int i = 0; i < enteros.length; i++) {

			enteros[i] = new Scanner(System.in).nextInt();

		}
		Arrays.sort(enteros);
		for (int i = enteros.length; i >= 0; i++) {
			System.out.println("numeros ordenados mayor menor : " + enteros[i]);

		}

	}

}
