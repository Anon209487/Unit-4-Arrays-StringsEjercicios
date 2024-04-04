/**
 * 
 */
package boletin2;

import java.util.Arrays;

/**
 * 
 */
public class Act4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[30];
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 - 10 + 1)));
		}
		Arrays.sort(enteros);
		System.out.println("introduce numero: " + enteros.toString());
	}

}
